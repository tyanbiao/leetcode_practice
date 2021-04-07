package $0509FibonacciNumber;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public int fib2(int n) {
        int x = 0, y = 1;
        if (n < 2) return n;
        for (int i = 2; i <= n; i++) {
            y += x;
            x = y - x;
        }
        return y;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        StdOut.println(solution.fib(29) == solution.fib2(29));
    }
}
