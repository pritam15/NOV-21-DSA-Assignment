class Stack {
    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX]; 
    boolean isEmpty(){
        return (top < 0);
    }
    Stack(){
        top = -1;
    }
 
    boolean push(int x){
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            arr[++top] = x;
            return true;
        }
    }
 
    int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = arr[top--];
            return x;
        }
    }
 
    int peek(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = arr[top];
            return x;
        }
    }
    
    void print(){
    for(int i = top;i>-1;i--){
      System.out.print(" "+ arr[i]);
    }
  }
}
 
// Driver code
class Main {
    public static void main(String args[]){
        Stack stack = new Stack();
        for(int i = 1;i<=10;i++){
            stack.push(i);
        }
        
        System.out.println("Top element is :" + stack.peek());
        System.out.print("Elements present in stack :");
        stack.print();
    }
}