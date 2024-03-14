import java.util.LinkedList;
import java.util.Queue;

public class E933NumberofRecentCalls {
    Queue<Integer> queue;

    public E933NumberofRecentCalls() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (t - queue.peek() > 3000){
            queue.poll();
        }
        return queue.size();
    }
}
