package $0136SingleNumber;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) res ^= num;
        return res;
    }

    public static void main(String[] args) {
        StdOut.println(new Solution().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
