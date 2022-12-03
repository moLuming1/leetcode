package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leet590 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postTraversal(root,result);
        return result;
    }
    public void postTraversal(Node root,List<Integer> result){
        if (root == null) {
            return;
        }
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++) {
            postTraversal(children.get(i),result);
        }
        result.add(root.val);
    }

}
