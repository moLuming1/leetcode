package Tree;

import java.util.HashMap;
import java.util.Map;

public class Leet105 {
    Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        TreeNode treeNode = findTreeNode(preorder, 0, preorder.length, inorder, 0, inorder.length);
        return treeNode;
    }

    public TreeNode findTreeNode(int[] preorder,int preBegin,int preEnd,int[] inorder,int inBegin,int inEnd){
        if(preBegin>=preEnd||inBegin>=inEnd){
            return null;
        }
        //根节点
        TreeNode root = new TreeNode(preorder[preBegin]);
        //当前中间节点所在位置
        Integer index = map.get(root.val);
        int nodes=index-inBegin;
        root.left=findTreeNode(preorder,preBegin+1,preBegin+1+index-inBegin,
                inorder,inBegin,index);
        root.right=findTreeNode(preorder,preBegin+1+index-inBegin,preEnd,
                inorder,index+1,inEnd);
        return root;
    }

}
