package homework2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[]{1, 2};
        array[1] = new int[]{3, 4, 5, 6, 7};
        array[2] = new int[]{8, 9, 0};
        array[3] = new int[]{8, 9, 0};
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                size++;
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(linearize(array, size)));
    }

    public static int[] linearize(int array[][], int size) {
        int[] oneDimensionalArray = new int[size];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                oneDimensionalArray[index] = array[i][j];
                index++;
            }
        }
        System.out.println();
        return oneDimensionalArray;
    }
}
