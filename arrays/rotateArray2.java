package arrays;

import java.util.Arrays;

public class rotateArray2 {

    public static void rotateArray(int[] arr1, int d) {
        int n = arr1.length;
        d = d % n;
        reverse(arr1, 0, d - 1);
        reverse(arr1, d, n - 1);
        reverse(arr1, 0, n - 1);

    }

    public static void reverse(int[] arr1, int i, int j) {
        while (i < j) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;

            i++;
            j--;
        }
    }

    public static void print(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr1 = { 12, 3, 45, 67, 98 };
        int d = 2;
        // System.out.println(Arrays.toString(arr1));
        print(arr1);
        System.out.println();
        rotateArray(arr1, d);
        // System.out.println(Arrays.toString(arr1));
        print(arr1);

    }
}
