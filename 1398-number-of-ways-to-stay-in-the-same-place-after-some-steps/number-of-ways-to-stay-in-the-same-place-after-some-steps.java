class Solution {
    static final int MOD = 1_000_000_007;

    public int numWays(int steps, int arrLen) {
        int maxPos = Math.min(steps / 2 + 1, arrLen);
        long[][] dp = new long[steps + 1][maxPos];

        dp[0][0] = 1;  // base case

        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j < maxPos; j++) {

                // stay
                dp[i][j] = dp[i - 1][j];

                // move left
                if (j > 0) 
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;

                // move right
                if (j + 1 < maxPos)
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MOD;
            }
        }

        return (int) dp[steps][0];
    }
}
