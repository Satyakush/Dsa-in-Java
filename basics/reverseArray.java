package basics;

import java.util.Arrays;

public class reverseArray {

    // public static int[] reverse(int[] array) {
    // int[] reversedArray = new int[array.length];
    // for (int i = 0; i < array.length; i++) {
    // reversedArray[i] = array[array.length - 1 - i];
    // }
    // return reversedArray;
    // }
    // public static void reversedArray(int[] array) {
    // int left = 0;
    // int right = array.length - 1;

    // while (left < right) {

    // int temp = array[left];
    // array[left] = array[right];
    // array[right] = temp;

    // left++;
    // right--;
    // }

    // }

    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5 };
    // System.out.println("Original Array: " + Arrays.toString(arr));

    // reversedArray(arr);
    // System.out.println("Reversed Array: " + Arrays.toString(arr));

    // // int[] rev = reverse(arr);
    // // System.out.println("Reversed Array: " + Arrays.toString(rev));
    // }
    // }

    public static void reverseArray(int[] arr) {
        int i = 3;
        int j = 6;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 34, 556, 23, 76, 236, 56, 567, 87, 35, 75 };

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        reverseArray(arr);
    }
}
// reversing whole arrray as well as part of an array