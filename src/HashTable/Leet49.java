package HashTable;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

public class Leet49 {

    public  static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String toString = new String(chars);
            if(!map.containsKey(toString)){
                map.put(toString,new ArrayList<String>());
            }
            map.get(toString).add(strs[i]);
        }
        Set<String> strings = map.keySet();
        for (String str:strings) {
            List<String> strings1 = map.get(str);
            list.add(strings1);
        }
        return list;
    }

    public static void main(String[] args) {
       String[] strings={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(strings);




    }
}
