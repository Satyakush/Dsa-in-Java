package ifElse;

import java.util.Scanner;

public class movingtoEnd {
    public static void main(String[] args) {
        int arr[] = { 12, 0, 78, 0, 67, 0, 0, 56 };

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
