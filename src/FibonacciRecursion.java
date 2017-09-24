import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Incorrect number entered!");
            return;
        } else if (number == 0) {
            System.out.println("0");
            return;
        } else if (number == 1) {
            System.out.println("0" + "\n" + "1" + "\n" + "1");
        } else {
            System.out.println("0" + "\n" + "1");
            for (int i = 1; i <= number; i++) {
                if (f(i) > number) {
                    return;
                } else {
                    System.out.println(f(i));
                }
            }
        }
    }

    public static int f(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 2;
        } else {
            return f(index - 1) + f(index - 2);
        }
    }
}