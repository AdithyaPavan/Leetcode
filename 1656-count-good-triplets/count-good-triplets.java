class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int max = 0;
        for(int x : arr) 
            max = Math.max(max,x);
        
        int[] count = new int[max + 2]; 
        
        int n = arr.length;
        int ans = 0;

        for(int j = 0; j < n; j++) {
            int y = arr[j];
            for(int k = j + 1; k <n; k++) {
                int z = arr[k];
                if(Math.abs(y - z) > b) 
                    continue;
                
                int l = Math.max(Math.max(y- a, z - c),0);
                int r = Math.min(Math.min(y + a, z + c), max);
                ans += Math.max(count[r + 1] - count[l], 0);
            }

            for(int x = y + 1; x < count.length; x++) 
                count[x]++;
        }
        return ans;        
    }
}