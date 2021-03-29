package $0053MaximumSubarray;
/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) sum = 0;
            sum += nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }
}
// @lc code=end

