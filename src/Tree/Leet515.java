package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet515 {
    public List<Integer> largestValues(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> results = new ArrayList<>();
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            int size=deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                list.add(node.val);
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }
            Collections.sort(list);
            results.add(list.get(list.size() - 1));
        }
        return results;
    }
}
