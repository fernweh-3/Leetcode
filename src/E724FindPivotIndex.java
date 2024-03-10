public class E724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum - nums[0] == 0) return 0;
        int left = 0, right = 0;
        for (int i = 1; i < nums.length; i++) {
            left += nums[i - 1];
            right = sum - left - nums[i];
            if (left == right) return i;
        }
        return -1;
    }
}
