class Solution {
    public int minCost(String colors, int[] arr) {
        int sum=0;
        for(int i=1;i<arr.length;i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                sum+=Math.min(arr[i],arr[i-1]);
                arr[i]=Math.max(arr[i],arr[i-1]);
            }
        }
        return sum;
    }
}