class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i:nums){
            int cnt=0;
            for(;i>0;i/=10)cnt++;
            if(cnt%2==0)res++;
        }
        return res;
        
    }
}