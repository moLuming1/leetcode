package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Leet1 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])){
                array[0]=i;
                array[1]=map.get(target-i);
            }
            map.put(nums[i],i);
        }
        return array;
    }

}
