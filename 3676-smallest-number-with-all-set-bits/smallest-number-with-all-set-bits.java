class Solution {
    public int smallestNumber(int n) {
        int i = 1;
        while (true) {
            int val = (int)Math.pow(2, i);
            if (val > n) return val - 1;
            i++;
        }
    }
}
