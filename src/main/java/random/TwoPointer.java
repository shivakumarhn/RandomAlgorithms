package random;

import java.util.Arrays;
import java.util.HashSet;

public class TwoPointer {

    static boolean hashArrayTwoCandidate(int A[], int arr_size, int sum) {

        int l = 0, r = arr_size - 1;
        Arrays.sort(A);

        while (l < r) {
            if (A[l] + A[r] == sum)
                return true;
            if (A[l] + A[r] < sum)
                l++;
            if (A[l] + A[r] > sum)
                r--;
        }
        return false;
    }

    static void printpairs(int arr[], int sum){
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i=0; i<arr.length; ++i){
            int temp = sum - arr[i];

            if (s.contains(temp)){
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }

    }

    public static void main(String[] args) {

        int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = 16;
        int arr_size = A.length;

        if (hashArrayTwoCandidate(A, arr_size, n))
            System.out.println("Array has two "
                    + "elements with given sum");
        else
            System.out.println("Array doesn't have "
                    + "two elements with given sum");




            int B[] = { 1, 4, 45, 6, 10, 8 };
            int o = 16;
            printpairs(A, n);

    }
}
