class Solution {
public:
    string convertToTitle(int columnNumber) {
        int n=columnNumber;
        string s;
        while(n>0){
            n--;
            s+='A'+n%26;
            n/=26;

        }
        reverse(s.begin(),s.end());
        return s;
    }
};