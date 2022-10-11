package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Leet350 {
    //第一个参数长度短，第二个长
    public int[] intersect(int[] nums1, int[] nums2) {
          if(nums1.length>nums2.length){
              return intersect(nums2,nums1);
          }
          //将短的数组存入map
        HashMap<Integer, Integer> map = new HashMap<>();
          for(int i:nums1){
              int count=map.getOrDefault(i,0)+1;
              map.put(i,count);
          }

         List<Integer> list = new ArrayList<>();
          for (int i:nums2){
              if(map.containsKey(i)){
                  list.add(i);
                  int count = map.getOrDefault(i, 0) - 1;
                  map.put(i,count);
                  if(map.get(i)==0){
                      map.remove(i);
                  }
              }
          }
        return list.stream().mapToInt(x->x).toArray();
    }
//public static void main(String[] args) {
//    HashMap< Integer, Integer> map = new HashMap<>();
//    Integer orDefault = map.getOrDefault(1, 222);
//    System.out.println(orDefault);
//    map.put(1,11);
//    System.out.println(map.size());
//    System.out.println(map.getOrDefault(1,23232));
//
//
//}

}
