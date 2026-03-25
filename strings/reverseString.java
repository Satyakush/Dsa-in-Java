package strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // for (int i = str.length() - 1; i >= 0; i--) {
        // char ch = str.charAt(i);
        // System.out.print(ch);
        // }
        int n = str.length();
        int start = 0;
        int end = str.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;

        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
