class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []f=new int[26];
        for(char c :tasks){
            f[c-'A']++;
        }
        int maxf=0;
        for(int i:f){
            maxf=Math.max(maxf,i);
        }
        int maxcnt=0;
        for(int i:f){
            if(i==maxf)maxcnt++;
        }
        int val=(maxf-1)*(n+1)+maxcnt;
        return Math.max(val,tasks.length);
    }
}