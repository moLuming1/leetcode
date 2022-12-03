package Tree;

import java.util.ArrayDeque;

public class Leet104 {
    public int maxDepth(TreeNode root) {
         if(root==null){
             return 0;
         }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
    public int myMaxDepth(TreeNode root) {
        ArrayDeque<TreeNode> deque= new ArrayDeque<>();
        int depth=0;
        if(root!=null){
            deque.add(root);
        }
        while (!deque.isEmpty()){
            int size = deque.size();
            depth+=1;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                if(node.left!=null){
                    deque.add(node.left);

                } if(node.right!=null){
                    deque.add(node.right);

                }
            }
        }
        return depth;
    }
}
