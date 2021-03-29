package $0122BestTimeToBuyAndSellStockII;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += Math.max(prices[i] - prices[i - 1], 0);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        StdOut.println(new Solution().maxProfit(prices));
    }
}
