package repl;

import java.util.Arrays;

public class LinearSearch {

    static int searchLinear(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
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
        // Arrays.sort(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));

        System.out.println("Element found at position " + searchLinear(arr, 40));
    }
}
