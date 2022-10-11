package string;

public class Leet151 {

    public String reverseWords(String s) {
        String space = reverseSpace(s);
        StringBuilder sb = new StringBuilder(space);
        reversed(sb,0,space.length()-1);
        reverseSingleWord(sb);
        return sb.toString();
    }

    //删除空格
    public  String reverseSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = s.length() - 1;
        //将前面和后面的空格除去
        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        while (start <= end) {
            if (s.charAt(start) != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(s.charAt(start));
            }
            start++;
        }
        return  sb.toString();
    }

    //字符串反转
    public   void reversed(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }

    }

    //字符串单词反转
    public    void reverseSingleWord(StringBuilder sb){
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reversed(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }



    public static void main(String[] args) {




    }


}
