package $0198HouseRobber;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int rob(int[] nums) {
        int m = 0, n = 0;
        for (int num : nums) {
            int t = n;
            n = Math.max(num + m, n);
            m = t;
        }
        return n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {2,7,9,3,1};
        int[] nums2 = new int[] {2, 1, 1, 2};
        StdOut.println(solution.rob(nums2));
    }
}
