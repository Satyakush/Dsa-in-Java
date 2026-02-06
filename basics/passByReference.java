// array is always passed by reference in java

package basics;

public class passByReference {

    public static void arrayReference(int[] arr) {

        arr[0] = 13;
        arr[3] = 45;

    }

    public static void main(String[] args) {

        int[] arr = { 12, 14, 78, 67 };
        System.out.println(arr[0] + " " + arr[3]);

        arrayReference(arr);
        System.out.println(arr[0] + " " + arr[3]);

    }
}
