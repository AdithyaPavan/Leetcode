class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int h=-1;
        for(int i:nums)h=Math.max(i,h);
        while(l<h){
            int m=l+(h-l)/2;
            int c=0;
            for(int i:nums){
                c+=(i-1)/m;
            }
            if(c<=maxOperations)h=m;
            else l=m+1;

        }
        return h;
        
    }
}