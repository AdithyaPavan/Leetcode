class Solution {
    int T;
    Integer[][] memo;
    
    public int findTargetSumWays(int[] nums, int S) {
        T = S - 1000;
        memo = new Integer[nums.length + 1][2002];
        return dfs(nums, 0, S);
    }
    
    private int dfs(int[] nums, int start, int target) {
        if(start == nums.length) {
            return (target == 0) ? 1 : 0;
        }
        
        if(memo[start][target - T] != null) {
            return memo[start][target - T];
        }
        
        int totalWays = dfs(nums, start + 1, target - nums[start]) + 
                        dfs(nums, start + 1, target + nums[start]);
        memo[start][target - T] = totalWays;

        return totalWays;
    }
}