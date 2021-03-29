package $0167TwoSumII;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        int[] res = new int[2];
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                res[0] = start + 1;
                res[1] = end + 1;
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        int[] res = solution.twoSum(numbers, target);
        StdOut.printf("[%d, %d]", res[0], res[1]);
    }
}
