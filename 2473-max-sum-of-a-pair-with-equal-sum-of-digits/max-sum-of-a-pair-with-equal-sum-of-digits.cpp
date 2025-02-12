class Solution {
public:
    int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    int maximumSum(vector<int>& nums) {
        sort(nums.begin(), nums.end(), [this](int a, int b) {
            int sumA = sumOfDigits(a), sumB = sumOfDigits(b);
            if (sumA == sumB) return a > b;
            return sumA < sumB;
        });
        
        int maxSum = -1, n = nums.size();
        
        for (int i = 1; i < n; i++) {
            if (sumOfDigits(nums[i]) == sumOfDigits(nums[i - 1])) {
                maxSum = max(maxSum, nums[i] + nums[i - 1]);
            }
        }
        
        return maxSum;
    }
};
