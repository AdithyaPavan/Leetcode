class Solution {

    public long maximumTripletValue(int[] nums) {
        long res=0;
        int val=nums[0];
        int diff=0;
        for(int i=0;i<nums.length;i++){
            res=Math.max(res,(long)diff*nums[i]);
            diff=Math.max(diff,val-nums[i]);
            val=Math.max(val,nums[i]);
        }return res;
    }
}