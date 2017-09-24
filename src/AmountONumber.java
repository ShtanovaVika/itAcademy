import java.util.Scanner;

public class AmountONumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println( "Sum of number: " + findTheSumOfNumber(number));
    }

    public static long findTheSumOfNumber (long number) {
        long sum = 0;
        if (number != 0) {
            sum = number % 10 + findTheSumOfNumber(number / 10);
        }
        return sum;
    }
}