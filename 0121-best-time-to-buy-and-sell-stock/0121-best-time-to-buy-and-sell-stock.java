class Solution {
    public int maxProfit(int[] prices) {
         int n=prices.length;
         int buy=Integer.MAX_VALUE;
         int profit=0;
         for(int i=0;i<n;i++)
         {
            buy=Math.min(buy,prices[i]);
            profit=Math.max(profit,prices[i]-buy);
         }
         return profit;
        
    }
}