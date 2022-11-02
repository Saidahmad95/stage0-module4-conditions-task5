package school.mjc.stage0.conditions.task5;

import java.time.Year;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        System.out.println(((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0) ? "leap" : "not leap");
    }
}
