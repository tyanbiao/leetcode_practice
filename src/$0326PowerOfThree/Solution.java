package $0326PowerOfThree;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public boolean isPowerOfThree(int n) {
        return n == 1 || n == 3 || (n > 0 && n % 3 == 0 && isPowerOfThree(n / 3));
    }

    public static void main(String[] args) {
        StdOut.println(new Solution().isPowerOfThree(-1));
    }
}
