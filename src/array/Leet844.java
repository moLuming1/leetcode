package array;

public class Leet844 {
    //利用栈
    public boolean backspaceCompare(String s, String t) {
           return buildString(s).equals(buildString(t));
    }
    public String buildString(String str){
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i <length; i++) {
            if(str.charAt(i)!='#'){
               stringBuffer.append(str.charAt(i));
            }else if (stringBuffer.length()>0) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();

    }
}
