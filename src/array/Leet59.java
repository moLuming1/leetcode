package array;

public class Leet59 {
    //循环不变量[)
    public static int[][] generateMatrix(int n) {
        int[][] target = new int[n][n];
        int startX = 0, startY = 0;
        int offset = 1;
        int counter=1;
        int q = 0;
        int i,j;
        while (q < n / 2) {
            //上
            for ( j = startX; j < n - offset; j++)
                target[startX][j]=counter++;
            //右
            for ( i = startX; i <n-offset ; i++)
                target[i][j]=counter++;
            //下
            for ( ;j>startX; j--)
                target[i][j]=counter++;
            //左
            for (;i>startX; i--) {
                target[i][j]=counter++;
            }
            startX++;
            startY++;
            offset++;
            q++;

        }

        //n为奇数,中间插最后一个数
        if(n%2==1){
            target[n/2][n/2]=counter;
        }
        return target;
    }

    public static void main(String[] args) {
        int[][] generateMatrix = generateMatrix(5);
        for (int i = 0; i < generateMatrix.length; i++) {
            for (int j = 0; j < generateMatrix.length; j++) {
                System.out.print(generateMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
