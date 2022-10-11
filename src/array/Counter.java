package array;

import java.util.HashMap;

public class Counter extends HashMap<Integer, Integer> {
    public int get(int k){
        return containsKey(k)?super.get(k):0;
    }

    public void add(int k, int v) {
        put(k, get(k) + v);
    }

}
