class Solution {
 public:
  long long countSubarrays(vector<int>& nums, int minK, int maxK) {
    long long res = 0;
    int j = -1;
    int mini = -1;
    int maxi = -1;

    for (int i = 0; i < nums.size(); ++i) {
      if (nums[i] < minK || nums[i] > maxK)
        j = i;
      if (nums[i] == minK)
        mini = i;
      if (nums[i] == maxK)
        maxi = i;
      res += max(0, min(mini, maxi) - j);
    }

    return res;
  }
};