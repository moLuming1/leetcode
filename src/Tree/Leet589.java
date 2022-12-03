package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leet589 {

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preTraversal(root,result);
        return result;
    }

    public void preTraversal(Node root,List<Integer> result){
        if (root == null) {
            return;
        }
        result.add(root.val);
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++) {
            preTraversal(children.get(i),result);
        }
    }

}
