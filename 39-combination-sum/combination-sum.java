class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int tar) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>sub=new ArrayList<>();
        helper(nums,0,res,sub,tar,0);
        return res;
    }
    public void helper(int[] nums,int curr,List<List<Integer>>res,List<Integer>sub,int tar,int idx){
        if(curr==tar){
            res.add(new ArrayList<>(sub));
            return;
            
        }
        if(idx==nums.length||curr>tar)return ;
        sub.add(nums[idx]);
        helper(nums,curr+nums[idx],res,sub,tar,idx);
        sub.remove(sub.size()-1);
        helper(nums,curr,res,sub,tar,idx+1);

    }
}