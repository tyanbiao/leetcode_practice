package $0283MoveZeroes;

import com.leetcode.kit.Tool;
import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i - count] = nums[i];
            count += nums[i] == 0 ? 1 : 0;
            nums[i] = count > 0 ? 0 : nums[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 0, 1, 0, 2, 3, 0};
        new Solution().moveZeroes(nums);
        StdOut.println(Tool.arrayToString(Tool.intsToIntegers(nums)));
    }
}
