class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>res=new ArrayList<>();
        int val=0;
        for(int i:nums){
            val=((val<<1)+i)%5;
            if(val==0)res.add(true);
            else res.add(false);
        }
        return res;
    }
}