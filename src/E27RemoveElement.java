import java.util.Arrays;

public class E27RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0, count = 0;
        while (i < nums.length - count) {
            if (nums[i] == val) {
                count++;
                for (int k = i; k < nums.length-1; k++) {
                    nums[k] = nums[k + 1];
                }
            } else {
                i++;
            }
        }
        return nums.length - count;
    }
}
