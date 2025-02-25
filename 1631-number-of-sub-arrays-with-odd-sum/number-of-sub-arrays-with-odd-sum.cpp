class Solution {
public:
    int numOfSubarrays(vector<int>& arr) {
        const int limit = 1000000007;
        int cnt = 0;
        int prefixSum = 0;
        int evenCount = 1, oddCount = 0; // Initially, consider an empty prefix as even
        
        for (int num : arr) {
            prefixSum += num;
            
            if (prefixSum % 2 == 1) { 
                cnt = (cnt + evenCount) % limit; 
                oddCount++;
            } else { 
                cnt = (cnt + oddCount) % limit; 
                evenCount++;
            }
        }
        
        return cnt;
    }
};

