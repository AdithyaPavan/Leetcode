class Solution {
    public int maxScore(String s) {
        int o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')o++;
        }
        int z=0;
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')z++;
            else o--;
            res=Math.max(res,z+o);
        }return res;
    }
}