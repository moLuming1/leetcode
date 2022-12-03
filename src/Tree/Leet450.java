package Tree;

public class Leet450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }else {
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            TreeNode current=root.right;
            while (current.left!=null){
                current=current.left;
            }
            current.left=root.left;
            root=root.right;
        }
        return root;
    }
}
