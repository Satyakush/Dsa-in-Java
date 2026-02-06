package ifElse;

import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter y : ");
        int y = sc.nextInt();

        if (x == 0 && y != 0) {
            System.out.println(x + " , " + y + " lies on y axis");
        } else if (y == 0 && x != 0) {
            System.out.println(x + " , " + y + " lies on x axis");
        } else if (x != 0 && y != 0) {
            System.out.println(x + "," + y + " neither lies on x axis nor lies on y axis");
        } else {
            System.out.println(x + " , " + y + " lies on origin ");
        }
    }
}
