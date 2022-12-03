package stackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
   Deque<Integer> deque= new LinkedList<Integer>();

   void poll(int value){
       if(!deque.isEmpty()&&deque.peek()==value){
           deque.poll();
       }
   }

   void push(int value){
       while (!deque.isEmpty()&&deque.getLast()<value){
           deque.removeLast();
       }
       deque.add(value);
   }

   int get(){
       return deque.peek();
   }
}
