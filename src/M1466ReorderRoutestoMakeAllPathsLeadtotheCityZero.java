import java.lang.reflect.Array;
import java.util.*;

public class M1466ReorderRoutestoMakeAllPathsLeadtotheCityZero {
    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < connections.length; i++) {
            list.get(connections[i][0]).add(connections[i][1]);
            list.get(connections[i][1]).add(-connections[i][0]);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        int count = 0;
        while (!queue.isEmpty()) {
            int pointer = queue.poll();
            for (Integer integer : list.get(Math.abs(pointer))) {
                if (!visited[Math.abs(integer)]) {
                    visited[Math.abs(integer)] = true;
                    queue.add(integer);
                    if (integer > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
