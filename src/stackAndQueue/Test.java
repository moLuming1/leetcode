package stackAndQueue;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,null);
        System.out.println(map.getOrDefault(1,11111));
    }
}
