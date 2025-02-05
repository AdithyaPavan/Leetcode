class Solution {
public:
    int maxDifference(string s) {
        unordered_map<char,int>mp;
        for(auto &i:s)mp[i]++;
        vector<int>freq;
        for(auto& p:mp){
            freq.push_back(p.second);
        }
        int maxo=INT_MIN;
        int mine=INT_MAX;
        for(int i:freq){
            if(i%2==0)mine=min(mine,i);
            if(i%2==1)maxo=max(maxo,i);            
        }
        return maxo-mine;
    }
};