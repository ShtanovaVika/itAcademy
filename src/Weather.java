import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        System.out.println("Enter number of days: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = scanner.nextInt();
        if (numberOfDay <= 0) {
            return;
        }
        int sumOfRainfall = 0, maxNumber = 0;
        for (int i = 1; i <= numberOfDay; i++) {
            System.out.print("Day " + i + ": " );
            int numberOfRainfall = scanner.nextInt();
            if (numberOfRainfall < 0 || numberOfRainfall > 100) {
                System.out.println("Incorrect rainfall entered!");
                return;
            }
            sumOfRainfall = sumOfRainfall + numberOfRainfall;
            if (maxNumber < numberOfRainfall) {
                maxNumber = numberOfRainfall;
            }
        }
        System.out.println("Number of day: " + numberOfDay );
        System.out.println("The sum of rainfall: " + sumOfRainfall);
        double averageValue = (double) sumOfRainfall / numberOfDay;
        System.out.println("The average value of rainfall: " + averageValue);
        System.out.println("The maximum number of rainfall " + maxNumber);
    }
}
