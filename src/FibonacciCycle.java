import java.util.Scanner;

public class FibonacciCycle {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        findTheFibonacciNumber(number);
    }

    public static void findTheFibonacciNumber (long number) {
        long theFirstFibonacci = 0;
        long theSecondFibonacci = 1;
        if (number < 0) {
            System.out.println("Incorrect number entered!");
            return;
        } else if (number == 0) {
            System.out.println(theFirstFibonacci);
            return;
        } else if (number == 1) {
            System.out.println(theFirstFibonacci);
            System.out.println(theSecondFibonacci);
            System.out.println(theSecondFibonacci);
        } else {
            System.out.println(theFirstFibonacci);
            System.out.println(theSecondFibonacci);
            long i;
            do {
                i = theFirstFibonacci + theSecondFibonacci;
                if (i > number)
                    break;
                theFirstFibonacci = theSecondFibonacci;
                theSecondFibonacci = i;
                System.out.println(i);
            } while (i < number);
        }
    }
}