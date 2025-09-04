class Solution {
    public boolean isPalindrome(String s) {
        int st=0;
        int e=s.length()-1;
        while(st<e){
            char fm=s.charAt(st);
            char lm=s.charAt(e);
            if(!Character.isLetterOrDigit(fm))st++;
            else if(!Character.isLetterOrDigit(lm))e--;
            else{
                if(Character.toLowerCase(fm)!=Character.toLowerCase(lm))return false;
                else{
                    st++;
                    e--;
                }
            }
        }return true;
    }
}