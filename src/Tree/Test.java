package Tree;

import java.util.*;

public class Test {
    public  static List<Integer> list=new ArrayList<>();

    public static void main(String[] args) {
        //System.out.println(getMin(15,45));
        f(14);
        for (Integer i : list) {
            System.out.print(i);
        }
    }



    public static int getMin(int a,int b) {
        int c = b;
        while (a%b != 0)
        {
            c = a%b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void f(int a){
        if(a==0){
            return;
        }
        f(a/2);
        list.add(a%2);


    }
}


