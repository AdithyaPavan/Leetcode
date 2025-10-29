class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        helper(nums,new ArrayList<>(),res);
        return res;
    }
    public void helper(int[]nums,List<Integer>sub,List<List<Integer>>res){
        if(sub.size()==nums.length){
            res.add(new ArrayList<>(sub));
            return ;
        }else{
            for(int i=0;i<nums.length;i++){
                if(sub.contains(nums[i]))continue;
                sub.add(nums[i]);
                helper(nums,sub,res);
                sub.remove(sub.size()-1);
            }
        }

    }
}