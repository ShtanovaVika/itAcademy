package homework2;

import java.util.Random;

public class ArrayMerging {
    public static void main(String[] args) {
        Random random = new Random();
        int[] theFirstArray = new int[random.nextInt(10)];
        for (int i = 0; i < theFirstArray.length; i++) {
            theFirstArray[i] = random.nextInt(10);
        }
        for (int number : theFirstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        int[] theSecondArray = new int[random.nextInt(10)];
        for (int i = 0; i < theSecondArray.length; i++) {
            theSecondArray[i] = random.nextInt(10);
        }
        for (int number : theSecondArray) {
            System.out.print(number + " ");
        }
        int sizeTheThirdArray = theFirstArray.length + theSecondArray.length;
        System.out.println();
        int j = 0, k = 0;
        int[] theThirdArray = new int[sizeTheThirdArray];
        for (int i = 0; i < sizeTheThirdArray; i++) {
            if (theFirstArray.length > theSecondArray.length) {
                if (i % 2 == 0 || i == 0) {
                    theThirdArray[i] = theFirstArray[j++];
                } else {
                    if (k < theSecondArray.length) {
                        theThirdArray[i] = theSecondArray[k++];
                    } else {
                        theThirdArray[i] = theFirstArray[j++];
                    }
                }
            } else {
                if (i % 2 != 0) {
                    theThirdArray[i] = theSecondArray[k++];
                } else {
                    if (j < theFirstArray.length) {
                        theThirdArray[i] = theFirstArray[j++];
                    } else {
                        theThirdArray[i] = theSecondArray[k++];
                    }
                }
            }
        }
        System.out.println();
        for (int number : theThirdArray) {
            System.out.print(number + " ");
        }
    }
}
