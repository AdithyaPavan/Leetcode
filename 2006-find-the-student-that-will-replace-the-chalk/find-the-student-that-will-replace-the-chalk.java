
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total = 0;
        for (int use : chalk) {
            total += use;
        }
        
        int remain = (int)(k % total);
        
        for (int i = 0; i < chalk.length; i++) {
            if (remain < chalk[i]) {
                return i;
            }
            remain -= chalk[i];
        }
        
        return 0;  
    }
}