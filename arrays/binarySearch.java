package arrays;

public class binarySearch {

    public static int binarSearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (key < numbers[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 6, 8, 10 };
        int key = 4;

        System.out.println(binarSearch(numbers, key));
    }
}