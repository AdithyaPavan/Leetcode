class Solution {
    public int maxSumDivThree(int[] nums) {
        int n=nums.length;
        long [][]dp=new long[n+1][3];
        // dp[0][0]=0;
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],Long.MIN_VALUE);
        }
        dp[0][0]=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                int nr=(j+nums[i])%3;
                dp[i+1][nr]=Math.max(dp[i][nr],dp[i][j]+nums[i]);
            }
        }
        return (int)dp[n][0];
    }
}