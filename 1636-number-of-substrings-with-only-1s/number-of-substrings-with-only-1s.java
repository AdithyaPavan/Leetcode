class Solution {
    public int numSub(String s) {
        long cnt = 0, res = 0, mod = 1000000007;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                cnt = 0;
            }
            res = (res + cnt) % mod;
        }
        return (int) res;
    }
}