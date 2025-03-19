class Solution {
public:
    int minOperations(vector<int>& nums) {
        int res=0;
        for(int i=0;i<nums.size()-2;i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                res++;
            }
        }
        for(int i:nums){
            if(!i)return -1;
        }
        return res;
    }
};