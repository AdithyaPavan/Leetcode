class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>sub=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,res,sub,0);
        return res;
    }
    public void helper(int[] nums,List<List<Integer>>res,List<Integer>sub,int idx){
        res.add(new ArrayList<>(sub));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1])continue;
            sub.add(nums[i]);
            helper(nums,res,sub,i+1);
            sub.remove(sub.size()-1);
        }
    }
}