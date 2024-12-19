class Solution {
    public int maxChunksToSorted(int[] arr) {
        int res=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
            if(maxi==i)res++;
        }return res;
    }
}