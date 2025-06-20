class Solution {
    public int maxDistance(String s, int k) {
        int res=0;
        int n=0;
        int s1=0;
        int e=0;
        int w=0;
        for(int i=0;i<s.length();i++){
            char d=s.charAt(i);
            if(d=='N')n++;
            if(d=='S')s1++;
            if(d=='E')e++;
            if(d=='W')w++;
            int b=Math.abs(n-s1)+Math.abs(e-w);
            int ext=Math.min(2*k,i+1-b);
            int total=b+ext;
            res=Math.max(res,total);


        }
        return res;
    }
}