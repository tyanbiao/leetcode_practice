package $0027RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int offset = 0;
        int i = 0;
        while (i + offset < nums.length) {
            if (nums[i] == val) {
                nums[i] = nums[nums.length - 1 - offset];
                offset++;
            } else {
                i++;
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
    int[] nums = {3,2,2,3};
    int res = solution.removeElement(nums, 3);
    System.out.println(res);
    System.out.println(solution.toStr(nums, res));
  }
}
