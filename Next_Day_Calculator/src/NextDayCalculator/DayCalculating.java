package NextDayCalculator;

public class DayCalculating {
   private int day;
   private int month;
   private int year;
   private String result;

    public DayCalculating() {
    }

    public DayCalculating(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean checkYear(int year) {
        boolean checkYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    checkYear = true;
                }
            } else {
                checkYear = true;
            }
        }
        return checkYear;
    }

    public String showDayOfLeapYear(int day, int month, int year) {
        boolean dayOfLeapYear = (day < 1 || day > 31 || month < 1 || month > 12 || (day == 30 & month == 2) || ( day == 31 & month == 2));
        if (dayOfLeapYear) {
            result = "Day doesn't exist";
        } else if (day == 29 & month == 2) {
            result = "Day:" + 1 + ", month:" + (month + 1) + ", year:" + year;
        } else {
            nextDay(day, month, year);
        }
        return result;
    }

    public String showDayOfNormalYear(int day, int month, int year) {
        boolean dayOfNormalYear = (day < 1 || day > 31 || month < 1 || month > 31 || (day == 30 & month == 2) || ( day == 31 & month == 2) || (day == 29 & month == 2));
        if (dayOfNormalYear) {
            result = "Day doesn't exist";
        } else if (day == 28 & month == 2) {
            result = "Day:" + 1 + ", month:" + (month + 1) + ", year:" + year;
        } else {
            nextDay(day, month, year);
        }
        return result;
    }

    public String nextDay(int day, int month, int year) {
        if (day == 31 && month == 12) {
            result = "Day:" + 1 + ", month:" +  1 + ", year:" + (year + 1);
        } else if (day == 30) {
            boolean monthAre30Day = (month == 4 || month == 6 || month == 9 || month == 11);
            if (monthAre30Day) {
                result = "Day:" + 1 + ", month:" + (month + 1) + ", year:" + year;
            } else {
                result = "Day:" + 31 + ", month:" + month + ", year:" + year;
            }
        } else if (day == 31) {
            boolean monthAre31Day = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);
            if (monthAre31Day) {
                result = "Day:" + 1 + ", month:" + (month + 1) + ", year:" + year;
            } else {
                result = "Day doesn't exist";
            }
        } else {
            result = "Day:" + (day + 1) + ", month:" + month + ", year:" + year;
        }
        return result;
    }
}
