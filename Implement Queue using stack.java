import java.util.Stack;

class MyQueue {
    Stack<Integer> stack;
    public MyQueue() {
        this.stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        this.stack.push(x);
    }
    
    public int pop() {
        int s = this.stack.elementAt(0);
        this.stack.removeElementAt(0);
        return s;
    }
    
    public int peek() {
        return this.stack.elementAt(0);
    }
    
    public boolean empty() {
        return this.stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
