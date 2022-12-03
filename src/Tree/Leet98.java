package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet98 {

    public List<Integer> list;

    public boolean myIsValidBST(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
        for (int i = 1; i <= list.size() - 1; i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }

        return true;
    }


    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        TreeNode pre = null;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                if(pre!=null&&current.val<=pre.val){
                    return false;
                }
                pre=current;
                current=current.right;
            }
        }
        return true;
    }


}
