package homework2;

import java.util.Scanner;

public class RomanNumberToArabic {
    public static void main(String[] args) {
        int arabicNumber = 0;
        int lastArabicNumber = 0;
        Scanner scan = new Scanner(System.in);
        String romanNumber = new String(scan.nextLine());
        String romanNumberToUpperCase = romanNumber.toUpperCase();
        for (int i = romanNumberToUpperCase.length() - 1; i >= 0; i--) {
            char currentNumber = romanNumberToUpperCase.charAt(i);
            switch (currentNumber) {
                case 'I':
                    arabicNumber = translationOfNumber(1, lastArabicNumber, arabicNumber);
                    lastArabicNumber = 1;
                    break;
                case 'V':
                    arabicNumber = translationOfNumber(5, lastArabicNumber, arabicNumber);
                    lastArabicNumber = 5;
                    break;
                case 'X':
                    arabicNumber = translationOfNumber(10, lastArabicNumber, arabicNumber);
                    lastArabicNumber = 10;
                    break;
                case 'L':
                    arabicNumber = translationOfNumber(50, lastArabicNumber, arabicNumber);
                    lastArabicNumber = 50;
                    break;
                case 'C':
                    arabicNumber = translationOfNumber(100, lastArabicNumber, arabicNumber);
                    lastArabicNumber = 100;
                    break;
                case 'D':
                    arabicNumber = translationOfNumber(500, lastArabicNumber, arabicNumber);
                    lastArabicNumber = 500;
                    break;
                case 'M':
                    arabicNumber = translationOfNumber(1000, lastArabicNumber, arabicNumber);
                    lastArabicNumber = 1000;
                    break;
                default:
                    System.out.print(currentNumber);
            }
        }
        System.out.println(arabicNumber);
    }

    public static int translationOfNumber(int romanNumberToArabic, int lastArabicNumber, int arabicNumber) {
        if (lastArabicNumber > romanNumberToArabic) {
            return arabicNumber - romanNumberToArabic;
        } else {
            return arabicNumber + romanNumberToArabic;
        }
    }
}




