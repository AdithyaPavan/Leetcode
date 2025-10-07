class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        for(String c:tokens){
            if(c.equals("+"))s.push(s.pop()+s.pop());
            else if(c.equals("-")){
                int sec=s.pop();
                int fir=s.pop();
                s.push(fir-sec);
            }
            else if(c.equals("*"))s.push(s.pop()*s.pop());
            else if(c.equals("/")){
                int fir=s.pop();
                int sec=s.pop();
                s.push(sec/fir);
            }
            else{
                s.push(Integer.parseInt(c));
            }

        }return s.peek();
    }
}