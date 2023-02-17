package Miniteste;

public class Date {
    public int day, month, year;

    public Date(int day, int month, int year) {
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

    public void Datecreate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean Validmonth(int month) {
        if ((month < 1) || (month > 12)) {
            return false;
        } else  {
            return true;
        }
    }

    public static boolean leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int monthDays(int month, int year) {
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            case 2:
            if ( leapYear(year)) {
                return 29;
            }
            else {
                return 28;
            }
            default: return 31;
        }
    }

    public static boolean valid(int day, int month, int year) {
        if ( Validmonth(month) && day <= monthDays(month, year) && day >= 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
