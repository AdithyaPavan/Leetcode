import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0L;
        for (int x : nums) sum += x;
        int tar = (int)(sum % p);
        if (tar == 0) return 0;

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int res = nums.length;
        long pre = 0L;

        for (int i = 0; i < nums.length; i++) {
            pre = (pre + nums[i]) % p;
            int need = (int)((pre - tar + p) % p);
            if (mp.containsKey(need)) {
                res = Math.min(res, i - mp.get(need));
            }
            mp.put((int)pre, i);
        }

        return res == nums.length ? -1 : res;
    }
}
