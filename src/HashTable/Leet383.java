package HashTable;

public class Leet383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] array = new int[26];
        int index = 0;
        for (int i = 0; i < magazine.length(); i++) {
            index = magazine.charAt(i) - 'a';
            array[index]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            index = ransomNote.charAt(i) - 'a';
            array[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return true;



    }

}
