class Solution {
    public int findFinalValue(int[] nums, int k) {
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        while(s.contains(k)){
            k*=2;
        }return k;
    }
}