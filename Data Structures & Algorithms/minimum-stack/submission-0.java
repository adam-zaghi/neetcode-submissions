class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> stackmin;

    public MinStack() {
        stack=new Stack<>();
        stackmin=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(!stackmin.empty()){
            if(stackmin.peek()<val){
                stackmin.push(stackmin.peek());
                    return; 
            }
        }
        stackmin.push(val);
    }
    
    public void pop() {
        stack.pop();
        stackmin.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stackmin.peek();
    }
}
