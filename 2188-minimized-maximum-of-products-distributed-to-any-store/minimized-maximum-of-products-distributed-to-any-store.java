class Solution {
    public int minimizedMaximum(int n, int[] arr) {
        int l=1;
        int h=Integer.MIN_VALUE;
        for(int i:arr){
            h=Math.max(i,h);
        }
        while(l<h){
            int m=l+(h-l)/2;
            int sum=0;
            for(int i:arr){
                sum+=(i+m-1)/m;
            }
            if(sum<=n){
                h=m;
            }else{
                l=m+1;
            }

        }return l;
        
    }
}