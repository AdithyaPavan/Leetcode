class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int res = 0;

        for(char c = 'a'; c <= 'z'; c++){
            int f = -1, l = -1;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == c){
                    if(f == -1) f = i;
                    l = i;
                }
            }

            if(f != -1 && l != -1 && l > f){
                HashSet<Character> set = new HashSet<>();
                for(int i = f + 1; i < l; i++){
                    set.add(s.charAt(i));
                }
                res += set.size();
            }
        }

        return res;
    }
}
