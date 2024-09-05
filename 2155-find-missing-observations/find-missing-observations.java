class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int tut = n + rolls.length;
        int lhs = tut * mean;
        int sum = 0;
        for(int i:rolls){
            sum+=i;
        }
        int rhs = lhs - sum;
        if(rhs<n || rhs>(6*n)){
            return new int[0];
        }
        int[] res = new int[n];
        int div = rhs / n;
        int rem = rhs % n;
        for(int i=0;i<n;i++){
            if(rem!=0){
                res[i] = res[i]+1;
                rem--;
            }
            res[i] += div;
        }
        return res;
    }
}