package homework2;

import java.util.Arrays;
import java.util.Random;

public class ArrayRecurrentNumbers {
    public static void main(String[] args) {
        int[] originalArray = new int[8];
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(15);
        }
        for (int number : originalArray) {
            System.out.print(number + " ");
        }
        boolean recurrenceNumber[] = new boolean[originalArray.length];
        int countRecurrenceNumber = 0;
        for (int i = 0; i < originalArray.length; i++) {
            int numberOriginalArray = originalArray[i];
            for (int j = i + 1; j < originalArray.length; j++) {
                if (numberOriginalArray == originalArray[j]) {
                    recurrenceNumber[j] = true;
                    countRecurrenceNumber++;
                }
            }
        }
        int[] result = new int[originalArray.length - countRecurrenceNumber];
        int j = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (!recurrenceNumber[i]) {
                result[j++] = originalArray[i];
            }
        }
        System.out.println("\n" + Arrays.toString(result));
    }
}

