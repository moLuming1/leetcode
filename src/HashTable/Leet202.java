package HashTable;

import java.util.HashSet;

public class Leet202 {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        boolean flag=true;
        while (n!=1) {
            n=get(n);
            if (hashSet.contains(n)) {
                flag=false;
                break;
            }
            hashSet.add(n);
        }
        return flag;
    }

    public static int get(int n) {
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }
}
