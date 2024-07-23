class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
        int a=g.size();
        int b=s.size();
        int res=0;
        for(int i=0,j=0;(i<a)&&(j<b);){
            if(s[j]>=g[i])i++,j++,res++;
            else j++;
        }
        return res;
    }
};