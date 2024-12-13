class Solution {
    public long findScore(int[] nums) {
        long res=0;
        int n=nums.length;
        for(int i=0;i<n;i+=2)
        {
            int start=i;
            int till=n-1;
            while(i<till && nums[i+1]<nums[i])
            {
                i++;
            }
            for(int j=i;j>=start;j-=2)
            {
                res+=nums[j];
            }
        }
        return res;
    }
}