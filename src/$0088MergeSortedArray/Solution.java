package $0088MergeSortedArray;

public class Solution {
    // 双指针从后往前
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1 = m - 1, pos2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (pos2 < 0) return;
            if (pos1 < 0 || nums1[pos1] <= nums2[pos2]) {
                nums1[i] = nums2[pos2];
                pos2--;
            } else {
                nums1[i] = nums1[pos1];
                pos1--;
            }
        }
    }

    public static String arrToString(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int num : nums) {
            sb.append(num);
            sb.append(',');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println(arrToString(nums1));
    }
}
