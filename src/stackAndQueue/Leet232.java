package stackAndQueue;

import java.util.Stack;

public class Leet232 {

    private Stack<Integer>stackIn;
    private Stack<Integer> stackOut;

    public Leet232() {
        stackIn = new Stack();
        stackOut = new Stack();
    }
    //将元素 x 推到队列的末尾
    void push(int x) {
        stackIn.push(x);
    }
    // 从队列的开头移除并返回元素
    int pop() {
        if(stackOut.empty()){
            removeAllStackIn();
        }
        return stackOut.pop();
    }
    //返回队列开头的元素
    int peek() {
        if(stackOut.empty()){
            removeAllStackIn();
        }
        return stackOut.peek();
    }

    //如果队列为空，返回 true ；否则，返回 false
    boolean empty() {
        return  stackIn.isEmpty()&&stackOut.isEmpty();

    }
    void removeAllStackIn() {
        while (!stackIn.empty()) {
            int peek = stackIn.peek();
            stackOut.push(peek);
            stackIn.pop();
        }
    }
}
