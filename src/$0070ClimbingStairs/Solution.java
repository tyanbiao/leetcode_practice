package $0070ClimbingStairs;

public class Solution {
    // 动态规划解决
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }
    // 递归超时XD，复杂度 O(2^n)
    public int climbStairs_D(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(45) == 1836311903);
    }
}
