class Solution {
public:
    bool hasSpecialSubstring(string s, int k) {
        int l=0;
        for(int r=0;r<s.length();r++){
            if(s[l]==s[r])continue;
            if(r-l==k)return true;
            l=r;

        }
        return (s.length()-l)==k;
    }
};