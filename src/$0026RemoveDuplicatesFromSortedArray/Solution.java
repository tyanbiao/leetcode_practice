package $0026RemoveDuplicatesFromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int offset = 0;
        for (int i = 1; i < nums.length; i++) {
            int currPos = i - offset;
            nums[currPos] = nums[i];
            if (nums[currPos] == nums[currPos - 1]) {
                offset += 1;
            }
        }
        return nums.length - offset;
    }

    public String toStr(int [] nums, int len) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < len; i++) {
        builder.append(nums[i]);
        if (i != len - 1) {
            builder.append(",");
        }
        }
        builder.append("]");
        return builder.toString();
    }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {1, 1, 2};
    int res = solution.removeDuplicates(nums);
    System.out.println(res);
    System.out.println(solution.toStr(nums, res));
  }
}
