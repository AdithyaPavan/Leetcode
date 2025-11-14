class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int res=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy)buy=prices[i];
            else if(prices[i]-buy>res)res=prices[i]-buy;
        }
        return res;
    }
}