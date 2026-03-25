package strings;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";

        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
            str = s + str.toLowerCase();
            System.out.println(str);
        } else if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
            str = s + str.toUpperCase();
            System.out.println(str);
        }
    }
}
