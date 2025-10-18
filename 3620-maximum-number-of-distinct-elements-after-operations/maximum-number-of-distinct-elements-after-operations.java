class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt=0;
        int pre=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int mini=nums[i]-k;
            int maxi=nums[i]+k;
            int x=pre+1;
            if(x<mini)x=mini;
            if(x<=maxi){
                cnt++;
                pre=x;
            }
        }return cnt;
    }
}