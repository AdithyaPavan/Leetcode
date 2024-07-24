class Solution {
public:
    int jump(vector<int>& nums) {
        if (nums.size() <= 1) return 0;
        
        for (int i = 1; i < nums.size(); ++i) {
            nums[i] = max(nums[i] + i, nums[i - 1]);
        }
        
        int ci = 0;
        int res = 0;
        
        while (ci < nums.size() - 1) {
            ++res;
            ci = nums[ci];
        }
        
        return res;
    }
};