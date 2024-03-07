import java.util.Arrays;
import java.util.Stack;

public class M735AsteroidCollision {


    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() < Math.abs(asteroids[i])) {
                    stack.pop();
                }
                if (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() == Math.abs(asteroids[i])) {
                    stack.pop();
                } else if (stack.isEmpty() || asteroids[i] > 0) {
                    stack.push(asteroids[i]);
                }
            }
        }

        int[] result = new int[stack.size() - 1];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

}
