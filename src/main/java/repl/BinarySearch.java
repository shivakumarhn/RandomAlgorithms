package repl;

import java.util.Arrays;

public class BinarySearch {

    static int binarySearch(int arr[], int low, int high, int target) {

        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] > target)
            return binarySearch(arr, low, mid - 1, target);

        return binarySearch(arr, mid + 1, high, target);
    }


    static int binarySearchItirative(int arr[], int target) {

        int low = 0, high = arr.length - 1, mid;

        while (high >= low) {

            mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] > target)
                high = mid - 1;

            else
                low = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {10, 40, 20, 50, 30, 48};
        Arrays.sort(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));
        // for(int element : arr){
        //   System.out.println(element);
        // }

        System.out.println("Element found at position " + binarySearch(arr, 0, arr.length - 1, 80));

        System.out.println("Element found at position " + binarySearchItirative(arr, 5));
    }
}
