package NextDayCalculator;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Testing 1 - 1 - 2018")
    void findNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "Day:2, month:1, year:2018";
        String result;

        DayCalculating dayCalculating = new DayCalculating(day, month, year);
        if (dayCalculating.checkYear(year)) {
            result = dayCalculating.showDayOfLeapYear(day, month, year);
        } else {
            result = dayCalculating.showDayOfNormalYear(day, month, year);
        }
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing 31 - 1 - 2018")
    void findNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "Day:1, month:2, year:2018";
        String result;

        DayCalculating dayCalculating = new DayCalculating(day, month, year);
        if (dayCalculating.checkYear(year)) {
            result = dayCalculating.showDayOfLeapYear(day, month, year);
        } else {
            result = dayCalculating.showDayOfNormalYear(day, month, year);
        }
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing 30 - 4 - 2018")
    void findNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "Day:1, month:5, year:2018";
        String result;

        DayCalculating dayCalculating = new DayCalculating(day, month, year);
        if (dayCalculating.checkYear(year)) {
            result = dayCalculating.showDayOfLeapYear(day, month, year);
        } else {
            result = dayCalculating.showDayOfNormalYear(day, month, year);
        }
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing 30 - 4 - 2018")
    void findNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "Day:1, month:3, year:2018";
        String result;

        DayCalculating dayCalculating = new DayCalculating(day, month, year);
        if (dayCalculating.checkYear(year)) {
            result = dayCalculating.showDayOfLeapYear(day, month, year);
        } else {
            result = dayCalculating.showDayOfNormalYear(day, month, year);
        }
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing 29 - 2 - 2020")
    void findNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "Day:1, month:3, year:2020";
        String result;

        DayCalculating dayCalculating = new DayCalculating(day, month, year);
        if (dayCalculating.checkYear(year)) {
            result = dayCalculating.showDayOfLeapYear(day, month, year);
        } else {
            result = dayCalculating.showDayOfNormalYear(day, month, year);
        }
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing 31 - 12 - 2018")
    void findNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "Day:1, month:1, year:2019";
        String result;

        DayCalculating dayCalculating = new DayCalculating(day, month, year);
        if (dayCalculating.checkYear(year)) {
            result = dayCalculating.showDayOfLeapYear(day, month, year);
        } else {
            result = dayCalculating.showDayOfNormalYear(day, month, year);
        }
        assertEquals(expected, result);
    }
}