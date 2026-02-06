package basics;

import java.util.Arrays;

public class rotateArray {

    public static void rotateWithSecondArray(int[] arr, int[] arr2) {
        int d = 3;
        int index = 0;
        for (int i = d; i < arr.length; i++) {
            arr2[index] = arr[i];
            index++;
        }
        for (int i = 0; i < d; i++) {
            arr2[index] = arr[i];
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 87, 56, 47, 04, 57, 34, 39 };
        int[] arr2 = new int[arr.length];
        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateWithSecondArray(arr, arr2);

        System.out.println("Rotated Array: " + Arrays.toString(arr2));

    }
}
