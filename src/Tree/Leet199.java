package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leet199 {
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> results = new ArrayList<>();
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                if (i == size - 1) {
                    results.add(node.val);
                }
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
            }
        }
        return results;
    }
}
