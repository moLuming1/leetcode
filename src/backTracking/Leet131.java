package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet131 {
    public List<List<String>> results = new ArrayList<>();
    public LinkedList<String> paths = new LinkedList<>();

    public List<List<String>> partition(String s) {
          backTracking(s,0 );
          return results;
    }


    public void backTracking(String s, int startIndex) {
        if (startIndex == s.length()) {
            results.add(new ArrayList<>(paths));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (palindrome(s, startIndex, i)) {
               paths.add(s.substring(startIndex, i+1));
            } else {
                continue;
            }
            backTracking(s, i+1);
            paths.removeLast();

        }
    }

    public boolean palindrome(String s, int startIndex, int endIndex) {
        for (int i = startIndex, j = endIndex; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;

    }
}
