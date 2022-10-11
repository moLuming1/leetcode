package array;

import java.util.ArrayList;
import java.util.List;

public class Leet54 {
    //循环不变量[)
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arrayList = new ArrayList<>();
        int rows = matrix.length;
        int column = matrix[0].length;
        int startX = 0, startY = 0;
        int offset = 1;
        int i, j;
        while (arrayList.size() <= rows * column) {
            //上
            for (j = startX; j < column - offset; j++)
                arrayList.add(matrix[startX][j]);
            //右
            for (i = startX; i < rows - offset; i++)
                arrayList.add(matrix[i][j]);
            //下
            for (; j > startX; j--)
                arrayList.add(matrix[i][j]);
            //左
            for (; i > startX; i--) {
                arrayList.add(matrix[i][j]);
            }
            startX++;
            startY++;
            offset++;
        }
       return arrayList;
    }

}
