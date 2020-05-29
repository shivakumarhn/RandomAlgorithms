package scDojo;

import java.util.Scanner;

public class Fibonacci {

    static int fib(int n) {

        if (n < 0)
            System.out.println("enter valid number");
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    static int fibb(int n) {
        // Assuming that n is positive integer
        if (n >= 3)
            return fib(n - 1) + fib(n - 2);
        else
            return 1;
    }

    static void fibbb(int n) {
        int n1 = 0;
        int n2 = 1;
        int temp;

        System.out.print(n1 + ", " + n2+ ", ");
        if (n >= 2) {
            for (int i = 0; i < n; i++) {
                temp = n1 + n2;
                n1 = n2;
                n2 = temp;
                System.out.print(temp +", ");
            }
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int n = s.nextInt();

        System.out.println("Fib Nth num is " + fib(n));
        System.out.println("Fib Nth num is " + fibb(n));
        fibbb(n);

    }
}
