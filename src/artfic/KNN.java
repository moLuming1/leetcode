package artfic;

import java.util.*;
import java.util.stream.Collectors;

public class KNN {


    /**
     * 计算距离
     * @param example
     * @param myExample
     * @return
     */
    public static Double distance(Example example, Example myExample) {
        Double colorDistance = (example.getColor() - myExample.getColor());
        Double hardnessDistance = (example.getHardness() - myExample.getHardness());
        Integer monthDistance = (example.getMonth() - myExample.getMonth());
        return Math.sqrt(colorDistance * colorDistance
                + hardnessDistance * hardnessDistance
                + monthDistance * monthDistance);
    }

    /**
     * @param k           前k个
     * @param examples    原测试用例集合
     * @param testExample 新测试用例
     * @return
     */
    public static Integer KNNDemo(int k, List<Example> examples, Example testExample) {
        Map<Double, Example> map = new HashMap<>();
        // 1.计算每个测试用例和新的测试用例的距离
        for (Example example : examples) {
            Double distance = distance(example, testExample);
            // System.out.println(distance);
            map.put(distance, example);
        }

        List<Double> array = new ArrayList<>(map.keySet());
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1 - i; j++) {//控制两个挨着的元素进行比较
                if (array.get(j) > array.get(j + 1)) {
                    Double temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }

        // 得到前k个小的距离
        List<Double> keys = array.stream().limit(k).collect(Collectors.toList());

        if (k == 1) {
            return map.get(keys.get(0)).getCatagory();
        }

        int[] ints = new int[keys.size()];
        for (int i = 0; i < keys.size(); i++) {
            ints[i] = map.get(keys.get(i)).getCatagory();
        }
        int[] result = topKFrequent1(ints, 1);
        return result[0];
    }

    /**
     * 计算集合前k个高频出现数
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();//key为数组元素值,val为对应出现次数
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //在优先队列中存储二元组(num,cnt),cnt表示元素值num在数组中的出现次数
        //出现次数按从队头到队尾的顺序是从大到小排,出现次数最多的在队头(相当于大顶堆)
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {//大顶堆需要对所有元素进行排序
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {//依次从队头弹出k个,就是出现频率前k高的元素
            ans[i] = pq.poll()[0];
        }
        return ans;
    }
}
