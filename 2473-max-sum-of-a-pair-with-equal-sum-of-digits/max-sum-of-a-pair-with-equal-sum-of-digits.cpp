#include <vector>
#include <algorithm>

using namespace std;

int sumOfDigits(int num) {
    int sum = 0;
    while (num > 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}

class Solution {
public:
    int maximumSum(vector<int>& nums) {
        sort(nums.begin(), nums.end(), [](int a, int b) {
            int sumA = sumOfDigits(a), sumB = sumOfDigits(b);
            if (sumA == sumB) return a > b;
            return sumA < sumB;
        });
        
        int maxSum = -1, l = 0, r = 0, n = nums.size();
        
        while (r < n) {
            while (r < n && sumOfDigits(nums[l]) == sumOfDigits(nums[r])) {
                if (r > l) {
                    maxSum = max(maxSum, nums[r] + nums[r - 1]);
                }
                r++;
            }
            l = r;
        }
        
        return maxSum;
    }
};
