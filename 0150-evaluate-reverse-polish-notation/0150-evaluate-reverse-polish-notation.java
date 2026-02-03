class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String part: tokens){
            if(part.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(part.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            }else if(part.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(part.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            }else{
                stack.push(Integer.parseInt(part));
            }
        }
        return stack.pop();
    }
}