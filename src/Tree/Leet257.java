package Tree;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> paths = new ArrayList<>();
        traversal(root, paths, result);
        return result;

    }

    public void traversal(TreeNode root, List<Integer> paths, List<String> result) {
        paths.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paths.size() - 1; i++) {
                sb.append(paths.get(i).toString());
                sb.append("->");
            }
            sb.append(paths.get(paths.size() - 1));
            result.add(sb.toString());
            return;
        }
        if (root.left != null) {
            traversal(root.left, paths, result);
            paths.remove(paths.size() - 1);
        }
        if (root.right != null) {
            traversal(root.right, paths, result);
            paths.remove(paths.size() - 1);
        }
    }


    public List<String> myBinaryTreePaths(TreeNode root) {
        //记录结果
        List<String> result = new ArrayList<>();
        //前序遍历栈
        Stack<TreeNode> treeNodes = new Stack<>();
        //保存每个节点从根节点的路径
        Stack<String> paths = new Stack<>();
        treeNodes.add(root);
        paths.add(root.val + "");
        while (!treeNodes.isEmpty()) {
            TreeNode node = treeNodes.pop();
            String path = paths.pop();
            if (node.left == null && node.right == null) {
                result.add(path);
            }
            if (node.right != null) {
                treeNodes.add(node.right);
                paths.add(path + "->" + node.right.val);
            }
            if (node.left != null) {
                treeNodes.add(node.left);
                paths.add(path + "->" + node.left.val);
            }
        }
        return result;
    }
}
