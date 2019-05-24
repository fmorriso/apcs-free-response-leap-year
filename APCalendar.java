import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class APCalendar
{
	/** Returns true if year is a leap year; otherwise, returns false */
	private static boolean isLeapYear(int year)
	{
		/*
		 * A year is a leap year if
		 * 
		 * it's divisible by 400,
		 * 
		 * or
		 * 
		 * it's divisible by 4 AND it's NOT divisible by 100.
		 */
		boolean result = (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
		return result;
	}

	/**
	 * Returns the number of leap years between year1 and year2, inclusive Precondition: 0 <= year1 <= year2
	 * 
	 * @param year1
	 *            - beginning year
	 * @param year2
	 *            - ending year
	 * @return number of leap years
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
	
	private static int firstDayOfYear(int year) {
		int result  = 0;
		Calendar c = GregorianCalendar.getInstance();		
		c.set(year, 0, 1);
		result = c.get(Calendar.DAY_OF_WEEK) - 1;
		return result;
	}
	
	public static int dayOfWeek(int month, int day, int year) {
		int result = 0;
		
		
		
		return result;
	}

}
