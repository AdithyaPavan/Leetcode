class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        HashSet<Character>mp=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(mp.contains(s.charAt(r))){
                mp.remove(s.charAt(l));
                l++;
            }
            mp.add(s.charAt(r));
            res=Math.max(r-l+1,res);
        }
        return res;
    }
}