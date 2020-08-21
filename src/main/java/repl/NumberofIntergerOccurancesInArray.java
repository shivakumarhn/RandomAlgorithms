package repl;

import java.util.Arrays;

public class NumberofIntergerOccurancesInArray {
    static int totalOccurrences(int arr[], int target) {

        if (arr.length == 0 || arr == null)
            return -1;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                count++;
        }
        return count;
    }


    static int totalOccurrencesOptimized(int arr[], int target) {
        if (arr.length == 0 || arr == null)
            return -1;

        int low = 0, high = arr.length, mid, count = 0;

        mid = low + high / 2;
        System.out.println(arr[mid] + " " + mid);

        if (target > arr[mid]) {
            for (int i = mid + 1; i < arr.length; i++) {
                if (arr[i] == target)
                    count++;
            }
            System.out.println("inside greater than target");
            return count;
        } else if (target < arr[mid]) {
            for (int i = 0; i < mid; i++) {
                if (arr[i] == target)
                    count++;
            }
            System.out.println("inside less than target");
            return count;
        } else if (arr[low] == arr[mid] && arr[high - 1] == arr[mid]) {
            System.out.println("one shot");
            return arr.length;
        } else {
            count++;
            int l = mid - 1, r = mid + 1;
            while (l > low || r < high) {
                if (arr[l] == target) {
                    count++;
                    l = l - 1;
                } else
                    l = low;
                if (arr[r] == target) {
                    count++;
                    r = r + 1;
                } else
                    r = high;
            }
            System.out.println("inside else ");
            return count;
        }
    }


    public static void main(String[] args) {


//int array[] = {0, 1, 0, -2, 5, 3, -7, 7};
        int array[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int target = 2;
        //totalOccurrences(array, target);
        System.out.println(totalOccurrencesOptimized(array, target));
    }
}
