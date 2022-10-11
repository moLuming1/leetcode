package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Leet225 {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public Leet225(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    public void push(int x) {
          queue2.offer(x);
          while (!queue1.isEmpty()){
              queue2.offer(queue1.poll());
          }
          Queue<Integer> tmp=queue1;
          queue1=queue2;
          queue2=tmp;
    }

    public int pop() {
         return queue1.poll();
    }

    public int top() {
         return  queue1.peek();
    }

    public boolean empty() {
         return queue1.isEmpty();
    }

}
