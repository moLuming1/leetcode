package linkTable;

/**
 * 递归十进制转换成二进制
 */
public class TenToTwo {
    public static void main(String[] args) {
        convertTo(10);
    }

    public static void convertTo(int n){
        if(n==0) {
            return ;
        } else {
		/* 不能这样写
		printf("%d",num%2);结果是0101  从上往下 ？ 在递归调用之上就是顺序输出
		change2(num/2);
		*/
            convertTo(n/2); //先反复调用自身后一次返回
            System.out.print(n%2);
        }

    }

}
