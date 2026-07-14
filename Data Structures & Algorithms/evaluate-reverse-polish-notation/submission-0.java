class Solution {
    public int evalRPN(String[] tokens) {
        int v1=0;
        int v2=0;
        Stack<Integer> stack=new Stack<>();
        for (String c:tokens){
            switch (c)
            {
                case "+":
                    v2=stack.pop();
                    v1=stack.pop();
                    stack.push(v1+v2);
                    break;
                case "*":
                    v2=stack.pop();
                    v1=stack.pop();
                    stack.push(v1*v2);
                    break;
                case "-":
                    v2=stack.pop();
                    v1=stack.pop();
                    stack.push(v1-v2);
                    break;
                case "/":
                    v2=stack.pop();
                    v1=stack.pop();
                    stack.push(v1/v2);
                    break;
                default:
                stack.push(Integer.parseInt(c));
                    
            }
        }return stack.peek();
    }
}
