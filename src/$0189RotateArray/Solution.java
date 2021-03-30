package $0189RotateArray;

import com.leetcode.kit.Tool;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] t = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(t, 0, nums, 0, t.length);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.rotate(nums, 3);
        StdOut.println(Tool.arrayToString(Tool.intsToIntegers(nums)));
    }
}
