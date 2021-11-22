import java.util.Stack;
public class FindMinElement {
    private static Stack<Integer> st;
    private static Stack<Integer> minSt;
    private static void push(int x) {
      
        st.push(x);
        
        if (minSt.isEmpty() || minSt.peek() > x) {
            minSt.push(x);
        } else {
            
            minSt.push(minSt.peek());
        }
    }
    private static void pop() {
       
        st.pop();
        minSt.pop();
    }
    
    private static int top() {
      
        return st.peek();
    }
    
    private static int getMin() {
      
        return minSt.peek();
    }
    public static void main(String[] args) {
        
        st = new Stack<>();
        minSt = new Stack<>();
        
        push(15);
        push(5);
        push(16);
        push(66);
        System.out.println(getMin());

    }
}