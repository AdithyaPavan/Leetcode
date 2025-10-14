class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (n < 2 * k) return false;

        int[] val = new int[n];
        val[0] = 1;

        // Compute increasing streaks
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                val[i] = val[i - 1] + 1;
            } else {
                val[i] = 1;
            }
        }

        // Check adjacent increasing subarrays
        for (int i = 0; i + 2 * k <= n; i++) {
            if (val[i + k - 1] >= k && val[i + 2 * k - 1] >= k) {
                return true;
            }
        }

        return false;
    }
}
