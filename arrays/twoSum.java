package arrays;

public class twoSum {

    public static void main(String[] args) {

        int[] arr = { 12, 45, 78, 53, 26, 67 };
        int target = 79;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }

}
