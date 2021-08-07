package random;

import java.util.Arrays;

public class SmallestPositiveIntegerInArray {

    public static void solution(int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > 0) {
                if (a[i] != a[i + 1] || (i == a.length - 2)) {
                    System.out.println(a[i]);
                    if (!(a[i+1] == a[i] + 1) || i == a.length - 2) {
                        if (a[i+1] == a[i]+1) {
                            System.out.println("Missing small positive interger is " + (a[i+1] + 1));
                            return;
                        }
                        System.out.println("Missing small positive interger is " + (a[i] + 1));
                        return;
                    }
                }
            }
        }
        System.out.println("Missing small positive interger is " + 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a[] = {1, 3, 6, 4, 1, 2, 5, 7, 8, 9, 10, 11, 12, 13, 14, 14, 14, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 26};

        int b[] = {-2, -1, 1, 3, 6, 4, 1, 2};
        int c[] = {-2, -1, 0};
        int d[] = {1, 2, 3};

        solution(d);

    }
}
