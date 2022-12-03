package Tree;

import java.util.ArrayDeque;
import java.util.List;

public class Leet559 {
    public int maxDepth(Node root) {
        ArrayDeque<Node> deque= new ArrayDeque<>();
        int depth=0;
        if(root!=null){
            deque.add(root);
        }
        while (!deque.isEmpty()){
            int size = deque.size();
            depth+=1;
            for (int i = 0; i < size; i++) {
                Node node = deque.pop();
                List<Node> children = node.children;
                for (int j = 0; j < children.size(); j++) {
                   deque.add(children.get(j));
                }
            }
        }
        return depth;
    }
    public int myMaxDepth(Node root) {
       if(root==null){
           return 0;
       }
       int depth=0;
       if(root.children!=null){
           for (Node child : root.children) {
               depth=Math.max(depth,myMaxDepth(child));
           }
       }
       return depth+1;

    }
}
