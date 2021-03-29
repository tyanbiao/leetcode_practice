package $0190ReverseBits;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
           res |= (n & 1) << ( 31 - i);
           n >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 0b11111111111111111111111111111101;
        int res = Integer.reverse(n);
        StdOut.println(res);
        StdOut.println(solution.reverseBits(n) == res);
    }
}
