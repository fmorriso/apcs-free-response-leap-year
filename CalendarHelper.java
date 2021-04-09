// AP CS Exam - 2019 - Free Response #1 - Leap Year
// Author: Fred Morrison
// This helper class uses built-in Java API calls to cross-check the College Board solution

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.TextStyle;
//
import java.util.Locale;

public class CalendarHelper
{
    private static final Locale locale = Locale.US;

    public static boolean isLeapYear(int year)
    {
        LocalDateTime t = LocalDateTime.of(year, Month.JANUARY, 1, 0, 0);
        return t.toLocalDate().isLeapYear();
    }

    public static int numberOfLeapYears(int year1, int year2)
    {
        int n = 0;
        for (int year = year1; year <= year2; year++)
            if (isLeapYear(year))
                n++;

        return n;
    }

    public static String dayOfWeekName(int month, int day, int year)
    {
        LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);
        //int dowNumber = t.getDayOfWeek().getValue();
        String dowName = t.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
        //System.out.format("CalendarHelper: dayOfWeekName: %d-%02d-%02d is week day number %d, which is a %s%n", year, month, day, dowNumber, dowName);
        return dowName;
    }

    /**
     * Returns relative day of week as defined in the 2019 College Board AP exam specification,
     * which differs from the Java/ISO-8601 standard because it uses Sunday=0,
     * Monday=1, ..., Saturday=6 instead of the standard Monday=0, Tuesday=1,..., Sunday=6.
     * <p>
     * Reference: https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html
     *
     * @param month
     * @param day
     * @param year
     * @return - College Board relative day of the week
     */
    public static int getDayOfWeekCollegeBoard(int month, int day, int year)
    {
        LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);
        //Built-in: 1 = Monday, 2=Tuesday,..., 7=Sunday
        int result = t.getDayOfWeek().getValue();
        // if "result", as determined above, is 7 (Sunday) we have to change it to 0 in order to adjust
        // the value returned by the Java built-in DayOfWeek.of() method to the values used by College Board for the exam.
        if (result == 7)
        { // Change from 1-7 (where 1=Monday, 7=Sunday) to 0-6 with Sunday = 0
            result = 0;
        }
        return result;
    }

    public static int getDayOfYear(int month, int day, int year)
    {
        LocalDateTime t = LocalDateTime.of(year, month, day, 0, 0);
        return t.getDayOfYear();
    }
}
