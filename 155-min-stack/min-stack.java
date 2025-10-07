import java.util.*;

class MinStack {
    private List<int[]> st;

    public MinStack() {
        st = new ArrayList<>();
    }
    
    public void push(int val) {
        int min_val = st.isEmpty() ? val : Math.min(st.get(st.size() - 1)[1], val);
        st.add(new int[]{val, min_val});
    }
    
    public void pop() {
        st.remove(st.size() - 1);
    }
    
    public int top() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[0];
    }
    
    public int getMin() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[1];
    }
}
