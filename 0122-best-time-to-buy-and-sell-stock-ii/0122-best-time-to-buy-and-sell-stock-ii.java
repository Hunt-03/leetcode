class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int cur=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            if((prices[i]-cur)>0)
            profit+=prices[i]-cur;
            cur=prices[i];
        }
        return profit;
    }
}