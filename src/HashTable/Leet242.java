package HashTable;

public class Leet242 {

    public static boolean isAnagram(String s, String t) {
        int[] array = new int[26];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            array[index]++;
        }
        for (int i = 0; i < t.length(); i++) {
            index = t.charAt(i) - 'a';
            array[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abc","cab"));
    }

}
