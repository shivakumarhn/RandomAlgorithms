package repl;

public class CheckIfSortedRotated {
    static boolean checkIfSortedRotated(int arr[]) {

        int minEle = Integer.MAX_VALUE;
        int minIndex = -1;

//check min element in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
                minIndex = i;
            }
        }

//check if array elements
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
