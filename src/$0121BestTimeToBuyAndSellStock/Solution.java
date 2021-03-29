package $0121BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, prveMax = 0;
        if (prices.length < 2) return res;
        for (int i = 1; i < prices.length; i++) {
            prveMax = prices[i] - prices[i - 1] + prveMax;
            prveMax = prveMax > 0 ? prveMax : 0;
            res = Math.max(prveMax, res);
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(nums));
    }
}
