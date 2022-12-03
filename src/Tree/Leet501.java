package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet501 {

    private List<Integer> result;
    private TreeNode pre=null;
    private int maxCount=0;
    private int count=0;
    public int[] findMode(TreeNode root) {
         result=new ArrayList<>();
         traverse(root);
         int[] array = new int[result.size()];
         for (int i = 0; i <result.size(); i++) {
            array[i]=result.get(i);
         }
        return array;
    }

    public void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        if(pre==null){
            count=1;
        }else if(root.val== pre.val){
            count++;
        }else {
            count=1;
        }

        if(count==maxCount){
            result.add(root.val);
        }
        if(count>maxCount){
            maxCount=count;
            result.clear();
            result.add(root.val);
        }
        pre=root;
        traverse(root.right);
    }
}
