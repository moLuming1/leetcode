package Tree;

import java.util.HashMap;
import java.util.Map;

public class Leet106 {

    Map<Integer,Integer> map;
    public  TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return findNode(inorder,0,inorder.length,postorder,0,postorder.length);
    }

    public   TreeNode findNode(int[] inorder,int inBegin,int inEnd,int[] postorder,int postBegin,int postEnd){
          if(inBegin>=inEnd||postBegin>=postEnd){
              return null;
          }
         // 得到根节点
         Integer index = map.get(postorder[postEnd - 1]);
         TreeNode root = new TreeNode(inorder[index]);
         int leftNodes=index-inBegin;
        root.left=findNode(inorder,inBegin,index,
                postorder,postBegin,postBegin+leftNodes);
        root.right=findNode(inorder,index+1,inEnd,
                postorder,postBegin+leftNodes, postEnd-1);
         return root;
    }

    public static void main(String[] args) {

    }

}
