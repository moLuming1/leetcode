package string;

public class LeetOffer58 {
    public static String reverseLeftWords(String s, int n) {

        StringBuilder stringBuilder = new StringBuilder(s);
        reverseWords(stringBuilder,0,n-1);
        reverseWords(stringBuilder,n,s.length()-1);
        reverseWords(stringBuilder,0,s.length()-1);
        return stringBuilder.toString();



    }

    public static void reverseWords(StringBuilder s,int start,int end){
        while (start<end){
            char temp = s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

    }
}
