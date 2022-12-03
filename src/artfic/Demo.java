package artfic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // 训练样例集
        List<Example> list = new ArrayList<>();
        Example example1 = new Example(2.0, 0.9, 6, 2);
        Example example2= new Example(1.5, 0.8, 5, 1);
        Example example3 = new Example(1.0, 1.0, 7, 1);
        Example example4 = new Example(3.0, 0.1, 3, 2);
        Example example5 = new Example(3.5, 0.08, 2, 2);
        Example newExample = new Example(1.5, 0.75, 4);
        list.add(example1);
        list.add(example2);
        list.add(example3);
        list.add(example4);
        list.add(example5);
        System.out.println(list.size());
        Integer catalog1 = KNN.KNNDemo(1, list, newExample);
        System.out.println(catalog1);
        Integer catalog2 = KNN.KNNDemo(3, list, newExample);
        System.out.println(catalog2);
    }
}
