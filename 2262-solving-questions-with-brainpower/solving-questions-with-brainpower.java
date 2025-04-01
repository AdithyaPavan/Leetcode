class Solution {
    public long mostPoints(int[][] questions) {
        long dp[]=new long[questions.length];
        int n=questions.length;
        for(int i=n-1;i>=0;i--){
            int ind=i+questions[i][1]+1;
            if(ind<n){
                dp[i]=dp[ind]+questions[i][0];

            }else dp[i]=questions[i][0];
            if(i<n-1){
                dp[i]=Math.max(dp[i+1],dp[i]);
            }
        }
        return dp[0];
    }
}