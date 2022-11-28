package searching;

import java.util.Arrays;

/*
 * Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search
 * interval in half. The idea of binary search is to use the information that the array is sorted
 * and reduce the time complexity to O(Log n).
 * */
public class BinarySearch {
    static int[] elements = new int[]{10,8, 7};

    public static void main(String[] args) {
        int key = 20;
        int size = elements.length;
        int index = -1;
        Arrays.sort(elements);
        if (size!=0){
            int high = size-1;
            int low = 0;
            //index = searchingInNonRecursiveWay(elements, key, low, high);
            index = searchingInRecursiveWay(elements, key, low, high);
        }

        if (index != -1){
            System.out.println("Element " + key + " is found at index: " + index);
        }else{
            System.out.println("Element " + key + " is not found");
        }

    }

    private static int searchingInRecursiveWay(int[] elements, int key, int low, int high) {

        if (high>=low) {
            int mid = (low + high) / 2;
            int midElement = elements[mid];
            if (midElement == key) {
                return mid;
            } else if (midElement > key) {
                return searchingInRecursiveWay(elements, key, low, mid - 1);
            } else
                return searchingInRecursiveWay(elements, key, mid + 1, high);
        }
        return -1;
    }

    private static int searchingInNonRecursiveWay(int[] elements, int key, int low, int high) {

        while(high >= low){
            int mid = (low + high)/2;
            int midElement = elements[mid];

            if (midElement==key){
                return mid;
            }else if (midElement>key){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

}
