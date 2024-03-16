import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class M62UniquePaths {
    public int uniquePaths(int m, int n) {
//        if (m == 1 || n == 1) return n == 1 ? m - 1 : n - 1;
//        return uniquePaths(m - 1, n - 1) * 2 + uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }
            }
        }
        return result[m - 1][n - 1];
    }
}
