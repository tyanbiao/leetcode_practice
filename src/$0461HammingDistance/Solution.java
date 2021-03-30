package $0461HammingDistance;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        StdOut.println(new Solution().hammingDistance(1, 4));
    }
}
