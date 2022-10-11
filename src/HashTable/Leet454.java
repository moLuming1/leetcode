package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Leet454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result=0; //存放结果
        Map<Integer, Integer> map = new HashMap<>();
        //map中存放nums1,nums2遍历和的结果 value为出现的次数
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int temp = map.getOrDefault(num1 + num2, 0) + 1;
                map.put(num1+num2,temp);
            }
        }

        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int temp=0-num3-num4;
                if(map.containsKey(temp)){
                    result+=map.get(temp);
                }
            }
        }

        return result;

    }

}
