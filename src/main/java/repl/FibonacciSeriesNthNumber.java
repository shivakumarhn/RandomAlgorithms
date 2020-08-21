package repl;

import java.util.HashMap;

public class FibonacciSeriesNthNumber {

    int fib_recurssion(int n) {

        if (n <= 1)
            return n;
        return fib_recurssion(n - 1) + fib_recurssion(n - 2);

    }

    int fib_memoization(int n) {

        int f[] = new int[n + 2];

        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    int fib_memoizationOrTopDown(int n) {

        if (hm.containsKey(n)) return hm.get(n);
        if (n == 0) return 0;
        if (n == 1) return 1;

        int nthValue = fib_memoizationOrTopDown(n - 1) + fib_memoizationOrTopDown(n - 2);
        hm.put(n, nthValue);
        return nthValue;
    }

    int fib_memoizationOrBottomUp(int n) {
        hm.put(0, 0);
        hm.put(0, 1);
        for (int i = 2; i < n; i++) {
            hm.put(i, hm.get(i - 1) + hm.get(i - 2));
        }
        return hm.get(n);
    }

    int fib_saveOnlyLastResult(int n) {

        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    int fib_BigOof1(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n)
                / Math.sqrt(5));
    }

    public static void main(String[] args) {

        FibonacciSeriesNthNumber m = new FibonacciSeriesNthNumber();

        //   System.out.println("Fib number is "+m.fib_recurssion(20));
        //  System.out.println("Fib number is "+m.fib_memoization(20));
        //   System.out.println("Fib number is "+m.fib_saveOnlyLastResult(20));
        // System.out.println("Fib number is "+m.fib_BigOof1(10));
        // System.out.println("Fib number is "+m.fib_memoizationOrTopDown(10));
        System.out.println("Fib number is " + m.fib_memoizationOrBottomUp(10));
    }
}
