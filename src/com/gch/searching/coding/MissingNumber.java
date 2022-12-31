package searching.coding;

import java.util.Arrays;

/*
 *
 * Given an array arr[] of size N-1 with integers in the range of [1, N],
 * the task is to find the missing number from the first N integers.
 * Note: There are no duplicates in the list.
 * */
public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 7, 4, 5, 6, 8};
        int n = 8;

        int sumOfFirstNNumbers = n * (n+1)/2;
        int actualSum = Arrays.stream(arr).reduce(0, Integer::sum);
        int missingNumber = sumOfFirstNNumbers-actualSum;

        System.out.println("Missing number is " + missingNumber);
    }
}
