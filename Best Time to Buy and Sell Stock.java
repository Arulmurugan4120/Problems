//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int minimumPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minimumPrice) {
                minimumPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minimumPrice);
            }
        }
        return maxProfit;
    }
}
