package $0912SortAnArray;

import com.leetcode.kit.Tool;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Solution {
    public int[] sortArray(int[] nums) {
        int[] res = Arrays.copyOf(nums, nums.length);
        quickSort(res, 0 , res.length);
        return res;
    }

    public void quickSort(int[] nums, int start, int end) {
        if (end - start < 2) return;
        if (end - start == 2) {
            if (nums[start] > nums[start + 1]) swap(nums, start, start + 1);
            return;
        }
        int dividedPos = divide(nums, start, end, (start + end) / 2);
        quickSort(nums, start, dividedPos);
        quickSort(nums, dividedPos + 1, end);
    }

    private int divide(int[] nums, int start, int end, int basePos) {
        int baseVal = nums[basePos], i = start;
        swap(nums, basePos, end - 1);
        basePos = end - 1;
        while (i < basePos) {
            if (nums[i] <= baseVal) {
                i++;
            } else {
                nums[basePos--] = nums[i];
                nums[i] = nums[basePos];
                nums[basePos] = baseVal;
            }
        }
        return basePos;
    }

    private void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1,2,-8,-10};
        int[] res = new Solution().sortArray(nums);
//        int[] res = Arrays.copyOf(nums, nums.length);
//        int pos = new Solution().divide(res, 0, res.length, 2);
//        StdOut.println(pos);
        StdOut.println(Tool.arrayToString(Tool.intsToIntegers(res)));
    }
}
