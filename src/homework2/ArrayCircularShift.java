package homework2;

import java.util.Random;

public class ArrayCircularShift {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int lastNumber = array[array.length - 1];
        for (int number : array) {
            System.out.print(number + " ");
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                array[0] = lastNumber;
            } else {
                array[i] = array[i - 1];
            }
        }
        System.out.println();
        for (int number : array) {
            System.out.print(number + " ");
        }
    }


}
