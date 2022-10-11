package array;

public class Leet904 {
    public int totalFruit(int[] fruits) {
        Counter counter = new Counter();
        int i=0;
        int result=0;
        for (int j = 0; j < fruits.length; j++) {
            counter.add(fruits[j],1);
            while (counter.size()>2){
                counter.add(fruits[i],-1);
                if(counter.get(i)==0){
                    counter.remove(fruits[i]);
                }
                i++;
            }
            result=Math.max(result,j-i+1);
        }
        return result;


    }


}
