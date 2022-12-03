package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Leet17 {


    public List<String> results = new ArrayList<>();
    public StringBuilder sb = new StringBuilder();
    public String[] string = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0){
            return results;
        }
        backTracking(digits, 0);
        return results;
    }


    /**
     * @param digits 数字字符串
     * @param index  数字字符串位置索引
     */
    public void backTracking(String digits, int index) {
        if (sb.length() == digits.length()) {
            results.add(sb.toString());
            return;
        }

        String s = string[digits.charAt(index) - '0'];
        for (int i = 0; i <s.length(); i++) {
            sb.append(s.charAt(i));
            backTracking(digits, index+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }


}
