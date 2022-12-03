package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leet20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.empty() || ch != stack.peek()) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
