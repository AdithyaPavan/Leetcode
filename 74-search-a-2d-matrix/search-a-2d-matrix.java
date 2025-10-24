class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int rs=mat.length;
        int cs=mat[0].length;
        int l=0;
        int h=rs*cs-1;
        while(l<=h){
            int m=(l+h)/2;
            int r=m/cs;
            int c=m%cs;
            int val=mat[r][c];
            if(val==target)return true;
            else if(val>target)h=m-1;
            else l=m+1;
        }
        return false;
    }
}