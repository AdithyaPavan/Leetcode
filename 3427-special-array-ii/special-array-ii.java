class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {       
        boolean []res=new boolean[queries.length];
        int[] arr=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1];
            if((nums[i-1]+nums[i])%2!=1)arr[i]++;
        }
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int c=arr[r]-arr[l];
            if(c==0)res[i]=true;
        }return res;
    }
}