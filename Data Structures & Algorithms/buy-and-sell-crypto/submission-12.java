class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minp = prices[0];
        int maxp = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minp) {
                minp = prices[i];
            } else if (prices[i] - minp > maxp) {
                maxp = prices[i] - minp;
            }
        }
        return maxp;
    }
}
