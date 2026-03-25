package ifElse;

import java.util.Scanner;

public class priceCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int discountedPrice;

        int discount;

        if (price < 1) {
            System.out.println("Error");
        } else if (price > 1 && price <= 1000) {
            discount = (5 * price) / 100;
            discountedPrice = price - discount;
            System.out.println(discountedPrice);
        } else if (price > 1000 && price < 5000) {
            discount = (10 * price) / 100;
            discountedPrice = price - discount;
            System.out.println(discountedPrice);
        } else if (price > 5000) {
            discount = (15 * price) / 100;
            discountedPrice = price - discount;
            System.out.println(discountedPrice);
        }
    }
}