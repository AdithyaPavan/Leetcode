class Solution {
public:
    string clearDigits(string s) {
        string res="";
        for(auto&i:s){
            if(isdigit(i) && !res.empty())res.pop_back();
            else res.push_back(i);           
        }return res;
        
    }
};