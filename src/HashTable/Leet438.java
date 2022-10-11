package HashTable;

import java.util.List;

public class Leet438 {

    public static List<Integer> findAnagrams(String s, String p) {
           int length=p.length();
           for(int i=0;i<=s.length()-length;i++){
               String substring = s.substring(i, i + length);
               System.out.println(substring);
           }
           return null;
    }

    public static void main(String[] args) {
        findAnagrams("cbaebabacd","abc");
    }


}
