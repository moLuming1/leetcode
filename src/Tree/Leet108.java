package Tree;

public class Leet108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return mySortedArrayToBST(nums,0,nums.length-1);
    }

    public TreeNode mySortedArrayToBST(int[] nums,int left,int right) {
        if(left>right){
            return null;
        }
        int mid=right+(left-right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=mySortedArrayToBST(nums,left,mid-1);
        root.right=mySortedArrayToBST(nums,mid+1,right);
        return root;
    }
}
