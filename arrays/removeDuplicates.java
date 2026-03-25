package arrays;

import java.util.*;

public class removeDuplicates {
  public static void main(String[] args) {

    // int arr[] = { 23, 56, 23, 78, 89, 78 };

    // Set<Integer> set = new HashSet<>();

    // for (int num : arr) {
    // set.add(num);
    // }

    // for (int num : set) {
    // System.out.print(num + " ");
    // }

    int arr[] = { 1, 2, 2, 4, 4, 4, 5, 7, 8, 8 };
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != arr[j]) {
        j++;
        arr[j] = arr[i];
      }
    }
    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
