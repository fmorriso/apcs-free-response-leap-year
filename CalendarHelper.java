// AP CS 2019 - Free Response - Leap Year
// This helper class uses built-in Java API calls to cross-check the College Board solution
import java.time.LocalDateTime;
import java.time.Month;


public class CalendarHelper
{
	public static boolean isLeapYear(int year) {
		LocalDateTime t = LocalDateTime.of(year, Month.JANUARY, 1, 0, 0);
		return t.toLocalDate().isLeapYear();		
	}

	public static int numberOfLeapYears(int year1, int year2)
	{
		int n = 0;
		for(int year = year1; year <= year2; year++)
			if(isLeapYear(year))
				n++;
		
		return n;
	}
}
