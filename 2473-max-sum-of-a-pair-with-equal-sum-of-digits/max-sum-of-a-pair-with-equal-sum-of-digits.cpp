class Solution {
public:
    int func(int i) {
        int s=0;
        while(i>0) {
            s+=i%10;
            i/=10;
        }return s;
    }    
    int maximumSum(vector<int>& nums) {
        sort(nums.begin(),nums.end(),[this](int a,int b){
            int sa=func(a),sb=func(b);
            if (sa==sb)return a>b;
            return sa<sb;
        });        
        int res=-1;      
        for (int i=1;i<nums.size();i++) {
            if (func(nums[i])==func(nums[i - 1])) {
                res=max(res,nums[i]+nums[i - 1]);
            }
        }        
        return res;
    }
};
