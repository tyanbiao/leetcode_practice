package $0035SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target){
                right = mid;
            } else {
                return mid;
            }
        }
        return nums[left] < target ?  left + 1 : left;
    }
  
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3,5,6};
        System.out.println(solution.searchInsert(nums, 0));
    }
}
