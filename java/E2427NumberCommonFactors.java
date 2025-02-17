public class E2427NumberCommonFactors {
    public int commonFactors(int a, int b) {
        int ans = 0;
        for (int x = 1; x <= Math.min(a, b); ++x) {
            if (a % x == 0 && b % x == 0) {
                ++ans;
            }
        }
        return ans;
    }
}
