// AP CS 2019 - Free Response - Leap Year
import java.time.*;
import java.time.format.*;
//
import java.util.Locale;

public class APCalendar
{
	private static final Locale locale = Locale.US;
	/**
	 * Returns true if year is a leap year; otherwise, returns false
	 * 
	 * A year is a leap year if
	 * 
	 * it's divisible by 400,
	 * 
	 * or
	 * 
	 * it's divisible by 4 AND it's NOT divisible by 100.
	 */
	private static boolean isLeapYear(int year)
	{
		boolean result = (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
		return result;
	}

	/**
	 * Returns the number of leap years between year1 and year2, inclusive.
	 * 
	 * 
	 * 
	 * @param year1
	 *            - beginning year
	 * @param year2
	 *            - ending year
	 * @return number of leap years
	 * 
	 * Precondition: 0 <= year1 <= year2
	 */
	public static int numberOfLeapYears(int year1, int year2)
	{
		int count = 0;
		for (int year = year1; year <= year2; year++)
		{
			if (isLeapYear(year))
				count++;
		}

		return count;
	}

	/**
	 * returns the value representing the day of the week for the first day of year, where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
	 * 
	 * Precondition: The date represented by month, day, year is a valid date.
	 * 
	 * @param year
	 *            - 4-digit year
	 * @return - value representing the day of the week.
	 */
	public static int firstDayOfYear(int year)
	{
		LocalDateTime t = LocalDateTime.of(year, Month.JANUARY, 1, 0, 0);
		int result = t.getDayOfMonth();
		return result;
	}

	public static int dayOfYear(int month, int day, int year)
	{
		int result;
		LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);
		result = t.getDayOfYear();
		System.out.format("dayOfYear: %d-%02d-%02d is day of year number %d%n", year, month, day, result);
		return result;
	}

	/**
	 * Return the value representing the day of the week for the given date (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday. Precondition: The date
	 * represented by month, day, year is a valid date.
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return - value
	 */
	public static int dayOfWeek(int month, int day, int year)
	{
		// use built-in technique to cross-check the result
		LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);
		DayOfWeek dow = t.getDayOfWeek();
		int n = dow.getValue();
		String dowName = DayOfWeek.of(n).getDisplayName(TextStyle.FULL, locale);
		System.out.format("dayOfWeek: LocalDateTime %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, n, dowName);

		int doy = t.getDayOfYear();
		System.out.format("dayOfWeek (API): LocalDateTime %d-%02d-%02d is day of year number %d%n", year, month, day, doy);
		
		// Use helper methods to determine dayOfWeek (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
		int result = (firstDayOfYear(year) + dayOfYear(month, day, year)) % 7;
		
		// NOTE: because the ISO 8601 standard uses 1-7 for Monday through Sunday, 
		// if "result", as determined above, is 0 (zero), we have to change it to 7 in order to make the next API call
		// to the Java built-in DayOfWeek.of() static method.
		// Reference: https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html
		if(result == 0) {
			n = 7;
		} else {
			n = result;
		}
		dowName = DayOfWeek.of(n).getDisplayName(TextStyle.FULL, locale);
		System.out.format("dayOfWeek (Exam technique): %d-%02d-%02d is relative day of the week number %d (%s)%n", year, month, day, result, dowName);
		return result;
	}

	public static String dayOfWeekName(int month, int day, int year)
	{		
		LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);
		int dowNumber = t.getDayOfWeek().getValue();
		String dowName = t.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
		System.out.format("dayOfWeekName: %d-%02d-%02d is week day number %d, which is a %s%n", year, month, day, dowNumber, dowName);
		return dowName;
	}

}
