package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leet116 {
    public Node connect(Node root) {
       /* Deque<Node> deque = new ArrayDeque<>();
        if(root!=null) {
            deque.add(root);
        }
        while (!deque.isEmpty()){
            int size=deque.size();
            Node nodePre=null;
            for (int i = 0; i < size; i++) {
                if(i==0){
                    Node node = deque.pop();
                    nodePre=node;
                }else {
                    Node pop = deque.pop();
                    nodePre.next=pop;
                    nodePre=pop;
                }
                if(nodePre.left!=null){
                    deque.add(nodePre.left);
                }
                if(nodePre.right!=null){
                    deque.add(nodePre.right);
                }
            }
        }*/
        return root;
    }
}
