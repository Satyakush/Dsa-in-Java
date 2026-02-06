package arrays;

import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int smax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("The maximum element of the array is " + max);
        System.out.print("The second maximum element of the array is " + smax);
        sc.close();
    }
}
