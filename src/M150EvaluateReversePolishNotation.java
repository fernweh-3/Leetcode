import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class M150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for (String s: tokens) {
            if (s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
                int right = deque.removeFirst();
                int left = deque.removeFirst();
                if (s.equals("*")) {
                    deque.addFirst(left * right);
                }
                if (s.equals("/")) {
                    deque.addFirst(left / right);
                }

                if (s.equals("+")) {
                    deque.addFirst(left + right);
                }

                if (s.equals("-")) {
                    deque.addFirst(left - right);
                }

            } else {
                deque.addFirst(Integer.valueOf(s));
            }
        }
        return deque.peekFirst();

    }
}
