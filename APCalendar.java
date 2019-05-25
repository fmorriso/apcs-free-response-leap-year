// AP CS 2019 - Free Response - Leap Year
import java.time.*;
import java.time.format.*;
//
import java.util.Locale;

public class APCalendar
{
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
		System.out.format("dayOfYear: %d-%d-%d is day of year %d%n", year, month, day, result);
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
		LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);

		DayOfWeek dow = t.getDayOfWeek();
		System.out.format("dayOfWeek: LocalDateTime %d-%d-%d is day of week %d%n", year, month, day, dow.getValue());

		int doy = t.getDayOfYear();
		System.out.format("dayOfWeek: LocalDateTime %d-%d-%d is day of year %d%n", year, month, day, doy);

		String name = dow.getDisplayName(TextStyle.FULL, Locale.US);
		System.out.format("dayOfWeek: LocalDateTime %d-%d-%d is day %s%n", year, month, day, name);

		//
		int result = (firstDayOfYear(year) + dayOfYear(month, day, year)) % 7;
		// System.out.format("dayOfWeek: %d-%d-%d is the %d day of the year%n", year, month, day, result);
		// int first = firstDayOfYear(year);
		// System.out.format("dayOfWeek: First day of year %d is %d%n", year, first);
		//result += firstDayOfYear(year);

		//result %= 7;
		System.out.format("dayOfWeek: %d-%d-%d is relative day of the week %d%n", year, month, day, result);
		return result;
	}

	public static String dayOfWeekName(int month, int day, int year)
	{
		String result = "";
		LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);
		result = t.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
		System.out.format("dayOfWeekName: %d-%d-%d is a %s%n", year, month, day, result);
		return result;
	}

}
