package backTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 */
public class Leet47 {
    public List<List<Integer>> results = new ArrayList<>();
    public LinkedList<Integer> paths = new LinkedList<>();
    public int[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new int[nums.length];
        backTracking(nums);
        return results;
    }

    public void backTracking(int[] nums) {
        if (paths.size() >= nums.length) {
            results.add(new ArrayList<>(paths));
            return;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(used[i]==1){
                continue;
            }
            if(map.getOrDefault(nums[i],0)!=0){
                continue;
            }
            paths.add(nums[i]);
            used[i]=1;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1 );
            backTracking(nums);
            used[i]=0;
            paths.removeLast();
        }

    }
}
