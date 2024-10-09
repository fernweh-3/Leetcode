import java.util.ArrayList;

public class E26RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int left = 0, right = 1, count = 1, pointer = nums[left];
        temp[left] = pointer;
        while (right < nums.length) {
            if (pointer != nums[right]) {
                pointer = nums[right];
                left++;
                count++;
                temp[left] = pointer;
            }
            right++;
        }
        for (int i = 0; i < count; i++) {
            nums[i] = temp[i];
        }
        return count;
    }
}
