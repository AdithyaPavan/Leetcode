class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        for(int i=0;i<res.length;i++){
            res[i]=-1;
        }

        int c=1;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]+1)c++;
            else c=1;
            if(c>=k){
                res[i+1-k]=nums[i];
            }


        }
            
        return res;
    }
}