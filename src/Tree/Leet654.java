package Tree;

public class Leet654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode treeNode = findTreeNode(nums, 0, nums.length);
        return treeNode;
    }

    public TreeNode  findTreeNode(int[] nums,int begin,int end){
        if(begin>=end){
            return null;
        }
        int max=nums[begin];
        int index=begin;
        for (int i=begin+1;i<end;i++){
              if(nums[i]>max){
                  max=nums[i];
                  index=i;
              }
        }
        TreeNode root = new TreeNode(max);
        root.left=findTreeNode(nums,begin,index);
        root.right=findTreeNode(nums,index+1,end);
        return root;
    }
}
