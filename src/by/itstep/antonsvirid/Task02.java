package by.itstep.antonsvirid;

import java.util.Scanner;

public class Task02 {
    public static String AgeСypher(int age) {

        if (age < 1 || age > 120) {
            return "Error";
        }
        String result = "";

        int unit = age % 10;
        age /= 10;
        int dozen = age % 10;
        age /= 10;
        int hundred = age;

        String unitDigit = "";

        switch (unit) {
            case 0:
                unitDigit = "";
                break;
            case 1:
                unitDigit = "one";
                break;
            case 2:
                unitDigit = "two";
                break;
            case 3:
                unitDigit = "three";
                break;
            case 4:
                unitDigit = "four";
                break;
            case 5:
                unitDigit = "five";
                break;
            case 6:
                unitDigit = "six";
                break;
            case 7:
                unitDigit = "seven";
                break;
            case 8:
                unitDigit = "eight";
                break;
            case 9:
                unitDigit = "nine";
                break;
        }

        String dozenDigit = "";

        switch (dozen) {
            case 0:
                dozenDigit = "";
                break;
            case 1:
                dozenDigit = "one";
                break;
            case 2:
                dozenDigit = "twenty";
                break;
            case 3:
                dozenDigit = "thirty";
                break;
            case 4:
                dozenDigit = "forty";
                break;
            case 5:
                dozenDigit = "fifty";
                break;
            case 6:
                dozenDigit = "sixty";
                break;
            case 7:
                dozenDigit = "seventy";
                break;
            case 8:
                dozenDigit = "eighty";
                break;
            case 9:
                dozenDigit = "ninety";
                break;
        }

        String hundredDigit = "";

        switch (hundred) {
            case 0:
                hundredDigit = "";
                break;
            case 1:
                hundredDigit = "one";
                break;
        }

        if (dozen == 0 && hundred == 0) {
            result = unitDigit;
        }  else if (hundred == 0 && dozen == 1 && unit ==1) {
            result = "eleven";
        } else if (hundred == 0 && dozen == 1 && unit == 2) {
            result = "twelve";
        } else if (hundred == 0 && dozen == 1 && unit == 3) {
            result = "thirteen";
        } else if (hundred == 0 && dozen == 1 && unit == 0) {
            result = "ten";
        } else if (hundred == 0 && dozen == 1) {
            result = unitDigit + "teen";
        } else if (hundred == 0 && dozen >= 2) {
            result = dozenDigit + " " + unitDigit;
        } else if (hundred == 1 && dozen == 0) {
            result = "one hundred and " + unitDigit;
        }  else if (hundred == 1 && dozen == 1 && unit == 0) {
            result = "one hundred and ten";
        }  else if (hundred == 1 && dozen == 1 && unit == 1) {
            result = "one hundred eleven";
        }  else if (hundred == 1 && dozen == 1 && unit == 2) {
            result = "one hundred twelve";
        }   else if (hundred == 1 && dozen == 1 && unit == 3) {
            result = "one hundred thirteen";
        }   else if (hundred == 1 && dozen == 1 && unit >= 4) {
            result = "one hundred and " + unitDigit + "teen";
        }
        return result;
    }

    public static void Printer(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number of age: ");
        int age = scanner.nextInt();

        String result = AgeСypher(age);

        Printer(result);
    }
}

