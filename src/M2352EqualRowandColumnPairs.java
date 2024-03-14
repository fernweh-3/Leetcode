import java.util.HashMap;
import java.util.Map;

public class M2352EqualRowandColumnPairs {
    public int equalPairs(int[][] grid) {
        Map<String, int[]> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            StringBuilder rowSb = new StringBuilder();
            StringBuilder colSb = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                rowSb.append(grid[i][j]);
                rowSb.append(" ");

                colSb.append(grid[j][i]);
                colSb.append(" ");
            }
            if (map.containsKey(rowSb.toString())) {
                map.get(rowSb.toString())[0]++;
            } else {
                map.put(rowSb.toString(), new int[]{1, 0});
            }
            if (map.containsKey(colSb.toString())) {
                map.get(colSb.toString())[1]++;
            } else {
                map.put(colSb.toString(), new int[]{0, 1});
            }
        }
        int result = 0;
        for (String s : map.keySet()) {
            result += map.get(s)[0]*map.get(s)[1];
        }
        return result;

    }

}
}
