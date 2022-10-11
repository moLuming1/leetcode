package string;

public class Test {
    public static void main(String[] args) {
        String s="abcdefg";
        String substring = s.substring(1, 3);
        System.out.println(substring);
        StringBuffer stringBuffer=new StringBuffer(s);
        stringBuffer.replace(1,4,"111");
        System.out.println(stringBuffer);

    }
}
