package random;

public class FindTriplet {


    boolean find3Numbers(int arr[], int arr_size, int sum) {
        for (int i = 0; i < arr_size - 2; i++) {
            for (int j = i + 1; j < arr_size - 1; j++) {
                for (int k = j + 1; k < arr_size; k++) {
                    if (sum == arr[i] + arr[j] + arr[k]) {
                        System.out.println("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FindTriplet triplet = new FindTriplet();
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arr_size = A.length;

        triplet.find3Numbers(A, arr_size, sum);
    }

}
