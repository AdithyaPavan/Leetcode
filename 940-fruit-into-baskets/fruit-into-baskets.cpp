class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int count=0;
        int n=fruits.size();
        map<int,int>mp;
        int l=0;
        for(int i=0;i<n;i++){
            mp[fruits[i]]++;
            while(mp.size()>2){
                mp[fruits[l]]--;
                if(mp[fruits[l]]==0)mp.erase(fruits[l]);
                l++;
            }
            count=max(count,i-l+1);
        }return count;
    }
};