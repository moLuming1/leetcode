package backTracking;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class Leet46 {
    public List<List<Integer>> results = new ArrayList<>();
    public LinkedList<Integer> paths = new LinkedList<>();
    public int[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new int[nums.length];
        backTracking(nums);
        return results;
    }

    public void backTracking(int[] nums) {
        if (paths.size() >= nums.length) {
            results.add(new ArrayList<>(paths));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1) {
                continue;
            }
            paths.add(nums[i]);
            used[i]=1;
            backTracking(nums);
            used[i]=0;
            paths.removeLast();
        }
    }
}
