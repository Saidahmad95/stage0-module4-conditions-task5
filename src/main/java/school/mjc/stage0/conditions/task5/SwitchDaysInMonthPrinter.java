package school.mjc.stage0.conditions.task5;

import java.time.LocalDate;
import java.time.Month;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        switch (month) {
            case 1:
                System.out.println(Month.of(1).length(false));
                break;
            case 2:
                System.out.println(Month.of(2).length(false));
                break;
            case 3:
                System.out.println(Month.of(3).length(false));
                break;
            case 4:
                System.out.println(Month.of(4).length(false));
                break;
            case 5:
                System.out.println(Month.of(5).length(false));
                break;
            case 6:
                System.out.println(Month.of(6).length(false));
                break;
            case 7:
                System.out.println(Month.of(7).length(false));
                break;
            case 8:
                System.out.println(Month.of(8).length(false));
                break;
            case 9:
                System.out.println(Month.of(9).length(false));
                break;
            case 10:
                System.out.println(Month.of(10).length(false));
                break;
            case 11:
                System.out.println(Month.of(11).length(false));
                break;
            case 12:
                System.out.println(Month.of(12).length(false));
                break;
            default:
                System.out.println("wrong number!");
        }
    }
}
