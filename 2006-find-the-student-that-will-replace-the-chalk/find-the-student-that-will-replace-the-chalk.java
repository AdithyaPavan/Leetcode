
class Solution {
    public int chalkReplacer(int[] chalk, int initialChalkPieces) {
        long total = 0;
        for (int use : chalk) {
            total += use;
        }
        
        int remain = (int)(initialChalkPieces % total);
        
        for (int i = 0; i < chalk.length; i++) {
            if (remain < chalk[i]) {
                return i;
            }
            remain -= chalk[i];
        }
        
        return 0;  
    }
}