class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int res=INT_MAX;
        int cnt=0;
        for(int i=0;i<blocks.size();i++){
            if(blocks[i]=='W')cnt++;
            if(i>=k&&blocks[i-k]=='W')cnt--;
            if(i>=k-1)res=min(res,cnt);
        }return res;
    }
};