class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int cur=prices[0];
        int max=Integer.MIN_VALUE;
        int profit=0;
        for(int i=1;i<n;i++){
        if(cur>prices[i])
        cur=prices[i];
        else if((prices[i]-cur)>profit){
            profit=prices[i]-cur;
        }
        }
        return profit;
    }
}