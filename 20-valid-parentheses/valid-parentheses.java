class Solution {
    public boolean isValid(String s1) {
        Stack<Character>s=new Stack<>();
        for(char ch:s1.toCharArray()){
            if(ch=='['||ch=='{'||ch=='(')s.push(ch);
            else{
                if(s.isEmpty())return false;
                char val=s.pop();
                if(ch==')'&&val!='(')return false;
                if(ch=='}'&&val!='{')return false;
                if(ch==']'&&val!='[')return false;

            }
        }
        return s.isEmpty();
    }
}