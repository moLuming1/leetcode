package HashTable;

import java.util.*;

public class Leet349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for(int i:nums2){
            if(set.contains(i)){
                set1.add(i);
            }
        }
        return set1.stream().mapToInt(x->x).toArray();


    }
}
