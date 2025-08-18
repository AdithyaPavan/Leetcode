class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(mp.containsKey(val)&&mp.get(val)!=i)
                return new int[]{i,mp.get(val)};
        }
        return new int []{};
        
    }
}