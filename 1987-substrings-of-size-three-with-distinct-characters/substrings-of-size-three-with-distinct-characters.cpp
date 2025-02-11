class Solution {
public:
    int countGoodSubstrings(string s) {
        int res=0;
        if(s.size()<2)return 0;
        for(int i=0;i<s.size()-2;i++){
            char a=s[i];
            char b=s[i+1];
            char c=s[i+2];
            if(a!=b &&b!=c &&c!=a)res++;
        }
        return res;
    }
};