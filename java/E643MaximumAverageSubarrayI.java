public class E643MaximumAverageSubarrayI {
    static public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i - 1 + k];
            max = Math.max(max, sum);
        }
        return max / k;
    }

    public static void main(String[] args) {
        findMaxAverage(new int[]{0, 4, 0, 3, 2}, 1);
    }
}
