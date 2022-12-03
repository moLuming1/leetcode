package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;






public class Leet513 {
    int depth=0;
    int value=0;
    public int findBottomLeftValue(TreeNode root) {
        traversal(root,0);
         return value;
    }

    public void traversal(TreeNode root,int leftLen){
        if(root.left==null&&root.right==null){
            if(leftLen>depth){
                depth=leftLen;
                value=root.val;
            }
            return;
        }
        if(root.left!=null){
            traversal(root.left, leftLen+1);
        }
        if(root.right!=null){
            traversal(root.right, leftLen+1);
        }
        return;
    }
    public int myFindBottomLeftValue(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        List<List<TreeNode>> result = new ArrayList<>();
        if (root != null) {
            deque.add(root);
          /*  List<TreeNode> list = new ArrayList<>();
            list.add(root);
            result.add(list);*/
        }
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<TreeNode> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
                list.add(node);
            }
            result.add(list);
        }
        return result.get(result.size()-1).get(0).val;
    }
}
