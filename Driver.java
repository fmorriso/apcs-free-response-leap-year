// AP CS Exam - 2019 - Free Response #1 - Leap Year
// Author: Fred Morrison
public class Driver
{

	public static void main(String[] args)
	{
		// Part A
		int year1 = 1990;
		int year2 = 2019;
		int n = APCalendar.numberOfLeapYears(year1, year2);
		System.out.format("APCalendar: There are %d leap years between %d and %d%n", n, year1, year2);

		// cross check above answer with built-in Java API
		int crossCheck = CalendarHelper.numberOfLeapYears(year1, year2);
		System.out.format("CalendarHelper: There are %d leap years between %d and %d%n", crossCheck, year1, year2);

		System.out.println("===========================");

		// Part B
		int year = 2019;
		int month = 1;
		int day = 1; // Tuesday, January 1, 2019

		System.out.format("Case Tuesday, January 1, 2019 %d-%02d-%02d%n", year, month, day);

		String name = APCalendar.dayOfWeekName(month, day, year);
		n = APCalendar.dayOfWeek(month, day, year);
		System.out.format("Driver using APCalendar: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, n, name);

		// cross check above answer with built-in Java API		
		crossCheck = CalendarHelper.getDayOfWeekCollegeBoard(month, day, year);
		System.out.format("Driver using CalendarHelper: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, crossCheck, name);

		System.out.println("===========================");

		day = 5; // Saturday, January 5, 2019
		System.out.format("Case Saturday, January 5, 2019 %d-%02d-%02d%n", year, month, day);

		name = CalendarHelper.dayOfWeekName(month, day, year);
		name = APCalendar.dayOfWeekName(month, day, year);
		n = APCalendar.dayOfWeek(month, day, year);
		System.out.format("Driver using APCalendar: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, n, name);

		// cross check above answer with built-in Java API
		crossCheck = CalendarHelper.getDayOfWeekCollegeBoard(month, day, year);
		System.out.format("Driver using CalendarHelper: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, crossCheck, name);

		System.out.println("===========================");

		day = 6; // Sunday, January 6, 2019
		System.out.format("Case Sunday, January 6, 2019 %d-%02d-%02d%n", year, month, day);

		name = CalendarHelper.dayOfWeekName(month, day, year);
		name = APCalendar.dayOfWeekName(month, day, year);
		n = APCalendar.dayOfWeek(month, day, year);
		System.out.format("Driver using APCalendar: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, n, name);

		// cross check above answer with built-in Java API
		crossCheck = CalendarHelper.getDayOfWeekCollegeBoard(month, day, year);
		System.out.format("Driver using CalendarHelper: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, crossCheck, name);

		System.out.println("===========================");

		month = 3;
		day = 1;
		year = 2017;

		System.out.format("Case %d-%02d-%02d%n", year, month, day);
		name = CalendarHelper.dayOfWeekName(month, day, year);
		name = APCalendar.dayOfWeekName(month, day, year);
		n = APCalendar.dayOfWeek(month, day, year);
		System.out.format("Driver using APCalendar: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, n, name);
		// cross-check the above answer using built-in Java API:
		crossCheck = CalendarHelper.getDayOfWeekCollegeBoard(month, day, year);
		System.out.format("Driver using CalendarHelper: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, crossCheck, name);

		System.out.println("===========================");

		year = 2016;
		System.out.format("Case %d-%02d-%02d%n", year, month, day);
		name = CalendarHelper.dayOfWeekName(month, day, year);
		name = APCalendar.dayOfWeekName(month, day, year);
		n = APCalendar.dayOfWeek(month, day, year);
		System.out.format("Driver using APCalendar: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, n, name);
		// cross-check the above answer using built-in Java API:
		crossCheck = CalendarHelper.getDayOfWeekCollegeBoard(month, day, year);
		System.out.format("Driver using CalendarHelper: %d-%02d-%02d is relative day of week number %d (%s)%n", year, month, day, crossCheck, name);

	}

}
