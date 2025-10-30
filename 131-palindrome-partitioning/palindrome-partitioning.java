class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>sub=new ArrayList<>();
        helper(s,0,res,sub);
        return res;
    }
    public void helper(String s,int idx,List<List<String>>res,List<String>sub){
        if(idx==s.length()){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(check(s,idx,i)){
                sub.add(s.substring(idx,i+1));
                helper(s,i+1,res,sub);
                sub.remove(sub.size()-1);
            }
        }
    }
    public boolean check(String s,int l,int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }return true;
    }
}