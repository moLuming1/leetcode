package string;

public class Leet28 {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        // 当 needle 是空字符串时我们应当返回 0
        if (m == 0) {
            return 0;
        }
        int n = haystack.length();
        if (n < m) {
            return -1;
        }
        int i = 0;
        int j = 0;
        while (i < n - m + 1) {
            // 找到首字母相等
            while (i < n && haystack.charAt(i) != needle.charAt(j)) {
                i++;
            }
            if (i == n) {// 没有首字母相等的
                return -1;
            }
            // 遍历后续字符，判断是否相等
            i++;
            j++;
            while (i < n && j < m && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {// 找到
                return i - j;
            } else {// 未找到
                i -= j - 1;
                j = 0;
            }
        }
        return -1;
    }

    public  static int strStr2(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        int[] next = getNext(needle);
        int i = 0, j = 0, start = 0;
        while (i < len1 && j < len2) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j=next[j];
                if(j==-1){
                   i++; j++;
                }
                start=i;
            }
        }
        if(j==len2) {return start;}
        return -1;
    }

    public  static int[] getNext(String needle) {
        int length = needle.length();
        int[] next = new int[length];
        next[0] = -1;
        for (int j = 1; j < length; j++) {
            //max表示j位置之前的前后相等的最大字段串长度
            int max = 0;
            for (int k = 1; k < j; k++) {
                String s1 = needle.substring(0, k);
                String s2 = needle.substring(j - k, j);
                if (s1.equals(s2)) {
                    max = k;
                }
            }
            next[j] = max;
        }
        return next;
    }

    public static void main(String[] args) {
        int[] ababcs = getNext( "cbacbacba");
        for (int i : ababcs) {
            System.out.print(i + " ");
        }
        System.out.println();
        int i = strStr2("mississippi",  "issip");
        System.out.println(i);


    }
}
