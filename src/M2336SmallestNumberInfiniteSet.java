import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class M2336SmallestNumberInfiniteSet {
    Queue<Integer> queue;

    public M2336SmallestNumberInfiniteSet() {
        queue = new PriorityQueue<>();
        for (int i = 1; i < 1001; i++) {
            queue.add(i);
        }
    }

    public int popSmallest() {
        return queue.poll();
    }

    public void addBack(int num) {
        if (!queue.contains(num)) {
            queue.offer(num);
        }
    }
}
