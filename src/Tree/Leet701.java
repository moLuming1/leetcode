package Tree;

public class Leet701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public TreeNode myInsertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode parent = root;
        TreeNode cur = root;
        while (cur != null) {
            parent = cur;
            if (cur.val > val) {
                cur = cur.left;
            } else if (cur.val < val) {
                cur = cur.right;
            }
        }
        TreeNode node = new TreeNode(val);
        if(parent.val>val){
            parent.left=node;
        }
        if(parent.val<val){
            parent.right=node;
        }
        return root;
    }

}
