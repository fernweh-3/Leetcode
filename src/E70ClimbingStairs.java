/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Constraints: 1 <= n <= 45
 */
public class E70ClimbingStairs {
    // recursive
    public int climbStairsRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    // tabulation
    public int climbStairsTabulation(int n) {
        int[] table = new int[n];
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            table[0] = 1;
            table[1] = 2;
            for (int i = 2; i < n; i++) {
                table[i] = table[i - 1] + table[i - 2];
            }
        }
        return table[n - 1];
    }
}
