class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        if(s1==s2) return true;
        vector<int>di;
        if(s1.size()!=s2.size())return false;
        for(int i=0;i<s1.length();i++){
            if(s1[i]!=s2[i])di.push_back(i);
        }
        if(di.size()==2){
            if(s1[di[0]]==s2[di[1]]&&s1[di[1]]==s2[di[0]])return true;
        }
        return false;
    }
};