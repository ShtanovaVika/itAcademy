import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        System.out.println("Enter day: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Incorrect day entered!");
            return;
        }
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Incorrect month entered!");
            return;
        } else {
            if (!checkMonth(month, day)) {
                return;
            }
        }
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        if (year < 0 || year > 3000) {
            System.out.println("Incorrect year entered!");
            return;
        } else {
            if (day == 29 && month == 2) {
                if (!isLeapYear(year)) {
                    System.out.println("Incorrect year entered!");
                    return;
                }
            }
            nextData(day, month, year);
        }
    }

    public static boolean checkMonth (int month, int day) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30) {
                    System.out.println("Incorrect month entered!");
                    return false;
                }
                break;
            case 2:
                if (day < 1 || day > 30) {
                    System.out.println("Incorrect month entered!");
                    return false;
                }
                break;
        }
        return true;
    }

    public static boolean isLeapYear (int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void nextData (int day, int month, int year)
    {
        if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year += 1;
        } else if ((day == 28 || day == 29) && month == 2) {
            if (day == 29 && isLeapYear(year)) {
                day = 1;
                month += 1;
            } else if (day == 28 && (!isLeapYear(year))) {
                day = 1;
                month += 1;
            } else day += 1;
        }
        else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month += 1;
        } else if (day == 31) {
            day = 1;
            month += 1;
        } else {
            day += 1;
        }
        System.out.println((zeroInFrontOfDayOrMonthOrYear(day) ? "0" + day : day) + "." + (zeroInFrontOfDayOrMonthOrYear(month) ? "0" + month : month) + "." + (zeroInFrontOfDayOrMonthOrYear(year) ? "0" + year : year));
    }

    public static boolean zeroInFrontOfDayOrMonthOrYear (int dayOrMonthOrYear) {
        if ( dayOrMonthOrYear > 0 && dayOrMonthOrYear < 10) {
            return true;
        } else {
            return false;
        }
    }
}
