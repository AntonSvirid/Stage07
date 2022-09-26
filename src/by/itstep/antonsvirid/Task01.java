package by.itstep.antonsvirid;

import java.util.Scanner;

public class Task01 {
        public static final String ERROR_MESSAGE = "Error, not correct input. Please restart program and try again";
    public static String CardLogic(int suit, int value) {

        if (suit < 1 || suit > 4 || value < 6 || value > 14) {
            return ERROR_MESSAGE;
        }

        String suitOfCard = "";
        String valueOfCard = "";
        String result = "";

        switch (suit) {
            case 1:
                suitOfCard = "Piki";
                break;
            case 2:
                suitOfCard = "Trefy";
                break;
            case 3:
                suitOfCard = "Bubny";
                break;
            case 4:
                suitOfCard = "Chervy";
                break;
        }

        switch (value) {
            case 6:
                valueOfCard = "6";
                break;
            case 7:
                valueOfCard = "7";
                break;
            case 8:
                valueOfCard = "8";
                break;
            case 9:
                valueOfCard = "9";
                break;
            case 10:
                valueOfCard = "10";
                break;
            case 11:
                valueOfCard = "Valet";
                break;
            case 12:
                valueOfCard = "Dama";
                break;
            case 13:
                valueOfCard = "Korol";
                break;
            case 14:
                valueOfCard = "Tuz";
                break;
        }

        result = valueOfCard + " " + suitOfCard;

        return result;
    }

    public static void Printer(String result) {
        if (result == ERROR_MESSAGE) {
            System.out.println(ERROR_MESSAGE);
        } else System.out.println("Your card is " + result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter card suit code: ");
        int suit = scanner.nextInt();
        System.out.println("Please, enter card value code: ");
        int value = scanner.nextInt();

        String result = CardLogic(suit, value);

        Printer(result);
    }
}
