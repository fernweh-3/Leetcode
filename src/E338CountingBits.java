public class E338CountingBits {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int exp = 0;
        while (n > 0) {
            exp++;
            n = n / 2;
        }
        while (exp > 0) {
            for (int i = (int) Math.pow(2, exp - 1); i < (int) Math.pow(2, exp - 1); i++) {

            }
        }
        return result;
    }
}
