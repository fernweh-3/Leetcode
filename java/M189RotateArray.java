
import java.util.Arrays;

public class M189RotateArray {


    public void rotate(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;
        int[] right = Arrays.copyOf(nums, nums.length - k);
        int[] left = Arrays.copyOfRange(nums, nums.length - k, nums.length);

        for (int i = 0; i < k; i++) {
            nums[i] = left[i];
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = right[i - k];
        }

    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
