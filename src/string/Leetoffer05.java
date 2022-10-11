package string;

public class Leetoffer05 {

    public static String replaceSpace(String s) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                newString.append("%20");
            }else{
                newString.append(s.charAt(i));
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        String s="we are happy";
        String s1 = replaceSpace(s);
        System.out.println(s1);
    }

}
