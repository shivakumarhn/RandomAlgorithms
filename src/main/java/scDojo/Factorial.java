package scDojo;

import java.util.Scanner;

public class Factorial {

    static int fact(int n) {
        if (n >= 1)
            return n * (n - 1);
        else
            return n = 1;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        if (n < 0)
            System.out.println("Please enter positive integer");
        else
            System.out.println("Factorial of the number " + n + " is " + fact(n));
    }
}
