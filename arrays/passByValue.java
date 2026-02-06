// variables are always passed by value in java

package arrays;

public class passByValue {

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        // System.out.println(a + " " + b);
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 13;

        System.out.println(a + " " + b);

        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println(a + " " + b);

        swap(a, b);

        System.out.println(a + " " + b);
    }
}
