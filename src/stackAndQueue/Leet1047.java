package stackAndQueue;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Leet1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> chars = new Stack<>();
        chars.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!chars.isEmpty()&&s.charAt(i) == chars.peek()) {
                chars.pop();
            } else {
                chars.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!chars.isEmpty()) {
            sb.append(chars.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
