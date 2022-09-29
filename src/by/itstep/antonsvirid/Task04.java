package by.itstep.antonsvirid;

import java.util.Scanner;

public class Task04 {

    public static final String BIG_MONTH = "In your month is 31 days.";
    public static final String SMALL_MONTH = "In your month is 30 days.";
    public static final String FEBRUARY_MONTH = "In your month is 28 days.";

    public static String DayMeasure(int month, int year) {

        String result = SMALL_MONTH;

        if (month <= 0 || month > 12 || year <= 0) {
            result = Task01.ERROR_MESSAGE;
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            result = BIG_MONTH;
        } else if (month == 2) {
            result = FEBRUARY_MONTH;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input number of month (1 - January, 2 - February,...): ");
        int month = scanner.nextInt();
        System.out.println("Please, input positive number of year in XXXX format: ");
        int year = scanner.nextInt();

        String feedback = DayMeasure(month, year);

        Task03.Printer(feedback);
    }
}
