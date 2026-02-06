package basics;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x :");
        int x;
        x = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = true;
                System.out.println("Found x at " + i);
                break;
            }
        }
        if (flag != true) {
            System.out.println("Not found " + x);
        }
        sc.close();
    }
}
