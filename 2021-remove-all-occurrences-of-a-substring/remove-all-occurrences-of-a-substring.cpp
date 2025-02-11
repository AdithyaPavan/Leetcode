class Solution {
public:
    string removeOccurrences(string s, string part) {
        string ans="";
        for(char i:s){
            ans.push_back(i);
            while(ans.find(part)!=string::npos){
                for(int i=0;i<part.size();i++){
                    ans.pop_back();
                }
            }
        }return ans;
    }
};