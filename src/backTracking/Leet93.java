package backTracking;

import java.util.ArrayList;
import java.util.List;

public class Leet93 {

    public List<String> results = new ArrayList<>();


    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return results;
        }
        backTracking(s, 0, 0);
        return results;
    }

    /**
     * @param s          字符串
     * @param startIndex 本次开始切割的位置
     * @param pointNum   到现在点加的个数
     */
    public void backTracking(String s, int startIndex, int pointNum) {
        if (pointNum == 3) {
            if (isValid(s, startIndex, s.length() - 1)) {
                results.add(new String(s));
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                backTracking(s, i + 2, pointNum + 1);
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else {
                break;
            }

        }

    }

    public final Character zero = '0';

    /**
     * 判断是否合法的ip字段
     * @param s
     * @param startIndex
     * @param endIndex
     * @return
     */
    public boolean isValid(String s, int startIndex, int endIndex) {
        if(startIndex>endIndex){
            return false;
        }
        String newStr = s.substring(startIndex, endIndex + 1);
        if (newStr.charAt(0) == zero&&startIndex!=endIndex) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) < '0' || newStr.charAt(i) > '9') {
                return false;
            }
            sum = sum * 10 + newStr.charAt(i) - '0';
        }
        if (sum > 255) {
            return false;
        }
        return true;
    }
}

