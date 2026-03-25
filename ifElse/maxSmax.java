package ifElse;

import java.util.Scanner;

public class maxSmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        if (n < 2) {
            System.out.println("smax not possible");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("max value is " + max);

        if (smax == Integer.MIN_VALUE) {
            System.out.println("smax not found");
        } else {
            System.out.println(smax);
        }
    }
}
