class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>res=new HashSet<>();
        for(int i:nums){
            if(res.contains(i))return true;
            res.add(i);
        }return false;
    }
}