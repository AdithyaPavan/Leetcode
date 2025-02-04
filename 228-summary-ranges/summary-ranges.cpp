class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        int f=0;
        int l=0;
        vector<string>res;
        if(!nums.size())return res;
        for(int i=1;i<nums.size();i++){
            if(nums[i]==nums[i-1]+1){
                l=i;
            }else{
                if(f==l)res.push_back(to_string(nums[f]));
                else res.push_back(to_string(nums[f])+"->"+to_string(nums[l]));
                f=i;
                l=i;
            }
        }
        if(f==l) res.push_back(to_string(nums[f]));
        else res.push_back(to_string(nums[f])+"->"+to_string(nums[l]));
        return res;
    }
};