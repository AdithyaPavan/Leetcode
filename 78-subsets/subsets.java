class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>sub=new ArrayList<>();
        helper(nums,0,res,sub);
        return res;
    }
    public void helper(int[] nums,int idx,List<List<Integer>>res,List<Integer>sub){
        if(idx==nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[idx]);
        helper(nums,idx+1,res,sub);
        sub.remove(sub.size()-1);
        helper(nums,idx+1,res,sub);
    }
}