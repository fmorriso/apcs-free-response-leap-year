
public class Driver
{

	public static void main(String[] args)
	{
		int year1 = 1990;
		int year2 = 2019;
		int n = APCalendar.numberOfLeapYears(year1, year2);
		System.out.format("There are %d leap years between %d and %d%n", n, year1, year2);

		System.out.println("===========================");
		
		int year = 2019;
		int month = 1;
		int day = 1; // Tuesday
		String name = APCalendar.dayOfWeekName(month, day, year);
		System.out.format("Driver: %d-%d-%d is a %s%n", year, month, day, name);
		n = APCalendar.dayOfWeek(month, day, year);
		System.out.format("Driver: %d-%d-%d is day of week %d%n", year, month, day, n);
	
		System.out.println("===========================");
		
		day = 5; // Saturday
		name = APCalendar.dayOfWeekName(month, day, year);
		System.out.format("Driver: %d-%d-%d is a %s%n", year, month, day, name);
		n = APCalendar.dayOfWeek(month, day, year);
		System.out.format("Driver: %d-%d-%d is day of week %d%n", year, month, day, n);
	
		
	
	}

}
