package ifElse;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;

            n = n / 10;

        }
        if (reverse == original) {
            System.out.println(original + "is a palindrome");
        } else {
            System.out.println(original + "not a palindrome");
        }
    }
}
