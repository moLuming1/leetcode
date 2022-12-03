package Tree;

import java.util.Stack;

public class Leet538 {

    int pre=0;
    public TreeNode convertBST(TreeNode root) {
        myConvertBST(root);
        return root;
    }

    public void myConvertBST(TreeNode root) {
        if(root==null){
            return;
        }
        convertBST(root.right);
        root.val+= pre;
        pre=root.val;
        convertBST(root.left);
    }
    public TreeNode ConvertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur=root;
        int prev=0;
        while (cur!=null||stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.right;
            }else {
                TreeNode node = stack.pop();
                node.val+=prev;
                prev= node.val;
                cur=node.left;
            }
        }
        return root;

    }
}
