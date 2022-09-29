package by.itstep.antonsvirid;

import java.util.Scanner;

public class Task03 {

    public static final String VOWEL_LETTER = "Your letter is vowel.";
    public static final String CONSONANT_LETTER = "Your letter is consonant.";

    public static String LetterMeasure(char letter) {

        String result = "Your symbol is not letter. Restart the program and try again";

        switch (letter) {
            case 'Q':
            case 'W':
            case 'R':
            case 'T':
            case 'P':
            case 'S':
            case 'D':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'Z':
            case 'X':
            case 'C':
            case 'V':
            case 'B':
            case 'N':
            case 'M':
                result = CONSONANT_LETTER;
                break;
            case 'A':
            case 'E':
            case 'U':
            case 'I':
            case 'O':
            case 'Y':
                result = VOWEL_LETTER;
                break;
        }

        return result;
    }

    public static void Printer(String feedback) {
        System.out.println(feedback);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input your letter: ");
        char letter = scanner.next().charAt(0);
        letter = Character.toUpperCase(letter);

        String feedback = LetterMeasure(letter);

        Printer(feedback);
    }
}
