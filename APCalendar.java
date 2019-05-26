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
	 * returns the value representing the day of the week for the first day of year, 
	 * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
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
		System.out.format("APCalendar firstDayOfYear: %d-%02d-%02d is day of year number %d%n", year, 1, 1, result);
		return result;
	}

	public static int dayOfYear(int month, int day, int year)
	{
		int result;
		LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);
		result = t.getDayOfYear();		
		//System.out.format("APCalendar dayOfYear: %d-%02d-%02d is day of year number %d%n", year, month, day, result);
		return result;
	}

	/**
	 * Return the value representing the day of the week for the given date (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday. Precondition: The date
	 * represented by month, day, year is a valid date.
	 * 
	 * @param month - month in range 1-12
	 * @param day - day of the month
	 * @param year - year
	 * @return - relative day of week (0=Sunday, 1=Monday,..., Saturday=6)
	 */
	public static int dayOfWeek(int month, int day, int year)
	{		
		// Use given helper methods to determine dayOfWeek (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
		int result = (firstDayOfYear(year) + dayOfYear(month, day, year)) % 7;
		return result;
	}



}
