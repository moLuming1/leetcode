package backTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 按照国际象棋的规则，皇后可以攻击与之处在同一行或同一列或同一斜线上的棋子。
 * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
 * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 */
public class Leet51 {
    public List<List<String>> results = new ArrayList<>();
    public List<String> paths = new ArrayList<>();
    public StringBuilder stringBuilder = new StringBuilder();
    public int[][] array;

    public List<List<String>> solveNQueens(int n) {
        array = new int[n][n];
        return results;
    }

    public void backTracking(int n, int startIndex) {
        if (startIndex > n) {

            return;
        }
        for (int i = startIndex; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                array[i][j]=1;

            }

        }

    }
}
