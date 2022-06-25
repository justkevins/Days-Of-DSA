class Solution {
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int stock = Integer.MAX_VALUE;
        int profit = 0;
        
        for (int i=0; i<n; i++)
        {
            if (prices[i] < stock) 
            {
                stock = prices[i];
            }
            if (profit < prices[i]-stock) 
            {
                profit = prices[i] - stock;
            }
        }
        
        return profit;
    }
}