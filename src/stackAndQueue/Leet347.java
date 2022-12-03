package stackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Leet347 {
    public int[] topKFrequent(int[] nums, int k) {
        //---------------暴力解法
       /* HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max;
        int key;
        int[] results = new int[k];
        for (int i = 0; i < k; i++) {
            max=0;
            key=0;
            Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Integer, Integer> entry : entrySet) {
                int val=entry.getValue();
                if(val>max){
                    max=val;
                    key=entry.getKey();
                }
            }
            results[i]=key;
            map.remove(key);
        }
        return results;*/
        //--------------------------大顶堆
      /*  Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //大顶堆
        PriorityQueue<int[]> pq=new PriorityQueue<>((pair1,pair2)->pair2[1]-pair1[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] results = new int[k];
        for (int i = 0; i < k; i++) {
            results[i]=pq.poll()[0];
        }
        return results;*/

        //------------------小顶堆
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //小顶堆
        PriorityQueue<int[]> pq=new PriorityQueue<>((pair1,pair2)->pair1[1]-pair2[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(pq.size()<k){
                pq.add(new int[]{entry.getKey(),entry.getValue()});
            }else if(entry.getValue()>pq.peek()[1]) {
                pq.poll();
                pq.add(new int[]{entry.getKey(),entry.getValue()});
            }
        }
        int[] results = new int[k];
        for (int i = k-1; i >= 0; i--) {
            results[i]=pq.poll()[0];
        }
        return results;
    }
}
