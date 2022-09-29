package by.itstep.antonsvirid;

import java.util.Scanner;

public class Task01 {
    public static final String ERROR_MESSAGE = "Error, not correct input. Please restart program and try again";
    public static final String SUIT_PIKI = "Piki";
    public static final String SUIT_TREFY = "Trefy";
    public static final String SUIT_BUBNY = "Bubny";
    public static final String SUIT_CHERVY = "Chervy";
    public static final String VALUE_SIX = "6";
    public static final String VALUE_SEVEN = "7";
    public static final String VALUE_EIGHT = "8";
    public static final String VALUE_NINE = "9";
    public static final String VALUE_TEN = "10";
    public static final String VALUE_VALET = "Vatel";
    public static final String VALUE_DAMA = "Dama";
    public static final String VALUE_KOROL = "Korol";
    public static final String VALUE_TUZ = "Tuz";

    public static String CardLogicСypher(int suit, int value) {

        if (suit < 1 || suit > 4 || value < 6 || value > 14) {
            return ERROR_MESSAGE;
        }

        String suitOfCard = "";
        String valueOfCard = "";
        String result = "";

        switch (suit) {
            case 1:
                suitOfCard = SUIT_PIKI;
                break;
            case 2:
                suitOfCard = SUIT_TREFY;
                break;
            case 3:
                suitOfCard = SUIT_BUBNY;
                break;
            case 4:
                suitOfCard = SUIT_CHERVY;
                break;
        }

        switch (value) {
            case 6:
                valueOfCard = VALUE_SIX;
                break;
            case 7:
                valueOfCard = VALUE_SEVEN;
                break;
            case 8:
                valueOfCard = VALUE_EIGHT;
                break;
            case 9:
                valueOfCard = VALUE_NINE;
                break;
            case 10:
                valueOfCard = VALUE_TEN;
                break;
            case 11:
                valueOfCard = VALUE_VALET;
                break;
            case 12:
                valueOfCard = VALUE_DAMA;
                break;
            case 13:
                valueOfCard = VALUE_KOROL;
                break;
            case 14:
                valueOfCard = VALUE_TUZ;
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

        String result = CardLogicСypher(suit, value);

        Printer(result);

        scanner.close();
    }
}
