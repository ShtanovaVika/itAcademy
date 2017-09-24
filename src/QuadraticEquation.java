import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int numberA = scanner.nextInt();
        if (numberA == 0) {
            System.out.println("You can't divide by zero!");
            return;
        }
        System.out.println("Enter number B: ");
        int numberB = scanner.nextInt();
        System.out.println("Enter number C: ");
        int numberC = scanner.nextInt();
        discriminant(numberA, numberB, numberC);
    }

    public static void discriminant(int numberA, int numberB, int numberC) {
        double valueDiscriminant = Math.pow(numberB, 2) - 4 * numberA * numberC;
        if (!isPositive(valueDiscriminant)) {
            System.out.println("Discriminant < 0!");
            return;
        } if (isZero(valueDiscriminant)) {
            rootsOfTheEquation (valueDiscriminant, numberA, numberB);
        } else {
            rootsOfTheEquation (valueDiscriminant, numberA, numberB);
        }
    }

    public static boolean isPositive (double valueDiscriminant) {
        return  valueDiscriminant >= 0 ? true : false;
    }

    public static boolean isZero(double valueDiscriminant) {
        return valueDiscriminant == 0 ? true : false;
    }

    public static void rootsOfTheEquation (double valueDiscriminant, int numberA, int numberB) {
        if (valueDiscriminant == 0) {
            System.out.println("x = " + ((-numberB) / (2 * numberA)));
            return;
        }
        System.out.println("x1 = " + ((-numberB + Math.sqrt(valueDiscriminant)) / (2 * numberA)));
        System.out.println("x2 = " + ((-numberB - Math.sqrt(valueDiscriminant)) / (2 * numberA)));
    }
}