package $0066PlusOne;

import com.leetcode.kit.Tool;

public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1, index = digits.length - 1;
        while (carry != 0 && index >= 0) {
            digits[index] += 1;
            carry = digits[index] / 10;
            digits[index] %= 10;
            index--;
        }

        if (carry == 0) {
            return digits;
        }
        int[] res = new int[digits.length + 1];
        res[0] = carry;
        System.arraycopy(digits, 0, res, 1, digits.length);
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {0};
        int[] res = solution.plusOne(digits);
        System.out.println(Tool.arrayToString(Tool.intsToIntegers(res)));
    }
}
