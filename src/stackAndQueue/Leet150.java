package stackAndQueue;

import java.util.Stack;

public class Leet150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if ("+".equals(token)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(token)) {
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(token)) {
                stack.push(stack.pop() * stack.pop());
            }else if ("/".equals(token)){
                int end=stack.pop();
                int first=stack.pop();
                stack.push(first/end);
            }else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }
}
