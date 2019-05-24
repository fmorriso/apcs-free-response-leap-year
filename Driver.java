
public class Driver
{

	public static void main(String[] args)
	{
		int year1 = 1990;
		int year2 = 2019;
		int n = APCalendar.numberOfLeapYears(year1, year2);
		System.out.format("There are %d leap years between %d and %d%n", n, year1, year2);

	}

}
