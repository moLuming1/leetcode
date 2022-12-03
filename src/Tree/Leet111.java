package Tree;

import java.util.ArrayDeque;

public class Leet111 {
    public int minDepth(TreeNode root) {
        int depth = 0;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            int size = deque.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode pop = deque.pop();
                if (pop.left == null && pop.right == null) {
                    return depth;
                }
                if (pop.left != null) {
                    deque.add(pop.left);
                }
                if (pop.right != null) {
                    deque.add(pop.right);
                }
            }
        }
        return depth;
    }

    public int myMinDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        if (root.left == null && root.right != null) {
            depth = 1 + myMinDepth(root.right);
        } else if (root.left != null && root.right == null) {
            depth = 1 + myMinDepth(root.left);
        } else {
            depth = Math.min(myMinDepth(root.left), myMinDepth(root.right)) + 1;
        }
        return depth;


    }
}
