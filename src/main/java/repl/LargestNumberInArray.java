package repl;

import java.util.Arrays;

public class LargestNumberInArray {


    static int largestNumberUsingWhileLoop(int arr[]) {

        if (arr.length == 0)
            throw new Error(" Array is empty ");

        int firstLargest = 0, counter = 0;

        while (counter < arr.length) {
            if (arr[counter] > firstLargest) {
                firstLargest = arr[counter];
            }
            counter += 1;
        }
        return firstLargest;
    }


    static int largestNumberWithOneVariable(int arr[]) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int largestUsingLibraryFun(int arr[]) {

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }


    public static void main(String args[]) {
        int A[] = {10, 324, 45, 90, 9808};

        System.out.println("Largest number is " + largestNumberUsingWhileLoop(A));

        System.out.println("Largest number is " + largestNumberWithOneVariable(A));

        System.out.println("Largest number is " + new LargestNumberInArray().largestUsingLibraryFun(A));
    }
}
