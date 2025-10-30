class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>res=new ArrayList<>();
        String map[]={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        helper(digits,0,res,new StringBuilder(),map);
        return res;

    }
    public void helper(String s,int idx,List<String>res,StringBuilder sb,String[] map){
        if(idx==s.length()){
            res.add(sb.toString());
            return;
        }
        String letters=map[s.charAt(idx)-'0'];
        for(char ch:letters.toCharArray()){
            sb.append(ch);
            helper(s,idx+1,res,sb,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}