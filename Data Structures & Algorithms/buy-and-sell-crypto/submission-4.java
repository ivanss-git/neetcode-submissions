class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null && prices.length < 2) {
            return 0;
        }
        int left = 0;
        int maxProf = 0;

        for (int right = 1; right < prices.length; right++) {
            if (prices[right] < prices[left]) {
                left = right;
            } 
            else {
                int currentProfit = prices[right] - prices[left];
                maxProf = Math.max(maxProf, currentProfit);
            }
        }
        return maxProf;
    }
}
