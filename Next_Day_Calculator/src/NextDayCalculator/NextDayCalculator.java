package NextDayCalculator;

import java.util.Scanner;

public class NextDayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        String result = "";

        DayCalculating dayCalculating = new DayCalculating(day, month, year);
        System.out.println("The next day is:");
        if (dayCalculating.checkYear(year)) {
           result = dayCalculating.showDayOfLeapYear(day, month, year);
        } else {
           result = dayCalculating.showDayOfNormalYear(day, month, year);
        }
        System.out.println(result);
    }
}
