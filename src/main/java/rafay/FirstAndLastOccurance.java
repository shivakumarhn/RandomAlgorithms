package rafay;

import java.util.Hashtable;
import java.util.Scanner;

public class FirstAndLastOccurance {


    static void FirstAndLastIndexes(int arr[], int target) {
        Hashtable<Integer, Integer> hs = new Hashtable<Integer, Integer>();
        int count = 0, first = 0, last = 0;

        if(arr.length == 0 || arr == null)
            System.out.println("Invalid input");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                first = i;
                count = i + 1;
                while (arr[count] != target) {
                    last = count - 1;
                    hs.put(first, last);
                   // System.out.println(hs.);
                }
            }
        }
        System.out.println("Element not fount");
    }


    static void zerosAtEnd(int arr[]){
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) {
               // arr[i] == arr[];
               // arr[arr.length - 1] = 0;
            }
        }
        System.out.println(arr.toString());
    }

    public static void main(String[] args) {

        int[] arr = {10,11,11,11,14,15};
        FirstAndLastIndexes(arr, 11);


    }

}
