package Tree;

import java.util.ArrayDeque;

public class Leet222 {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int myCountNodes(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        int count = 0;
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            int size = deque.size();
            count += size;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
            }
        }
        return count;
    }
}
