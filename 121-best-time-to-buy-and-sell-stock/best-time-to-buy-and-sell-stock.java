class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int l=0;
        int n=prices.length;
        int i;
        for(i=1;i<n;i++){
            if(prices[l]>prices[i])l=i;
            else maxi=Math.max(prices[i]-prices[l],maxi);
            
        }return maxi;
    }
}