import java.util.List;

public class M120Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        // bottom up
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                // get the smaller one from the two elements below
                int nextMin = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j+1));
                // sum up and update the current node
                triangle.get(i).set(j,triangle.get(i).get(j) + nextMin);
            }
        }
        return triangle.get(0).get(0);
    }
}
