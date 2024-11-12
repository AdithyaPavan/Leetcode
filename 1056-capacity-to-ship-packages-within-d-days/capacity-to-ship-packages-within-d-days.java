class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int weight : weights) {
            l = Math.max(l, weight);  // The minimum capacity needed
            r += weight;              // The maximum capacity needed
        }
        
        while (l < r) {
            int m = l + (r - l) / 2;
            int sum = 0;
            int req = 1;  // Start with 1 day

            for (int weight : weights) {
                if (sum + weight > m) {
                    req++;       // Start a new day
                    sum = weight;
                } else {
                    sum += weight;
                }
            }

            if (req <= days) {
                r = m;  // Try a smaller capacity
            } else {
                l = m + 1;  // Increase capacity
            }
        }
        
        return l;  // l is the minimum capacity required
    }
}
