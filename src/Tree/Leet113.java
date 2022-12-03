package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Leet113 {

    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root!=null){
            List<Integer> integers = new ArrayList<>();
            integers.add(root.val);
            traversal(root,targetSum-root.val,integers);
        }
        return result;
    }

    public void traversal(TreeNode root, int target, List<Integer> list) {
        if (root.left == null && root.right == null && target == 0) {
            result.add(list);
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        if (root.left != null) {
            List<Integer> list1 = new ArrayList<>(list);
            list1.add(root.left.val);
            traversal(root.left,target-root.left.val,list1);
        }
        if (root.right != null) {
            List<Integer> list1 = new ArrayList<>(list);
            list1.add(root.right.val);
            traversal(root.right,target-root.right.val,list1);
        }

    }

    public List<List<Integer>> myPathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<List<Integer>> stack3 = new Stack<>();
        if (root != null) {
            stack1.add(root);
            stack2.add(root.val);
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            stack3.add(list);
        }
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            Integer sum = stack2.pop();
            List<Integer> pop = stack3.pop();
            if (node.left == null && node.right == null && sum == targetSum) {
                result.add(pop);
            }
            if (node.right != null) {
                stack1.add(node.right);
                stack2.add(sum + node.right.val);
                List<Integer> collect = pop.stream().map(i -> i).collect(Collectors.toList());
                collect.add(node.right.val);
                stack3.add(collect);
            }
            if (node.left != null) {
                stack1.add(node.left);
                stack2.add(sum + node.left.val);
                List<Integer> collect = pop.stream().map(i -> i).collect(Collectors.toList());
                collect.add(node.left.val);
                stack3.add(collect);
            }
        }
        return result;


    }


}
