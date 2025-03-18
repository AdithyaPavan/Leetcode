class Solution {
public:
    int longestNiceSubarray(vector<int>& nums) {
        int res=1;
        int l=0;
        int mask=0;
        for(int r=0;r<nums.size();r++){
            while((mask&nums[r])!=0){
                mask^=nums[l];
                l++;
            }
            mask |=nums[r];
            res=max(res,r-l+1);
        }return res;
    }
};