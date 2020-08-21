package repl;

public class SecondLargestNumberInArray {

  /*
     Ruin time Complexity: n^2 + 2n + C (c1 + c2+ c3)
     Order of Growth
     C < n < log n <  n * log n < n^2 < n^3 < n^n
  */

    int secondLarge(int arr[]) {

        int firstLarge = 0, secondLarge = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.printf("arr[%d] = %d", i, arr[i]);
            System.out.printf("\t BEFORE: First Large = %d, Second Large = %d", firstLarge, secondLarge);

            if (arr[i] > secondLarge)
                secondLarge = arr[i];

            if (secondLarge > firstLarge) {
                temp = firstLarge;
                firstLarge = secondLarge;
                secondLarge = temp;
            }

            System.out.printf("\t AFTER: First Large = %d, Second Large = %d", firstLarge, secondLarge);
            System.out.println();
        }
        return secondLarge;
    }

    int secondLargestNumber(int arr[]) {
       /* int first=second= ;
        first = second = Integer.MIN_VALUE;*/
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int arr[] = {8, 4, 7, 9};
        SecondLargestNumberInArray m = new SecondLargestNumberInArray();
        System.out.println("Second largest number is " + m.secondLarge(arr));

    }
}
