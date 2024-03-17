import java.util.Arrays;

public class E283MoveZeroes {
    public static void moveZeroes(int[] nums) {
//        int firstZero = nums.length;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (nums[i] == 0) {
//                firstZero--;
//                for (int j = i; j < firstZero; j++) {
//                    nums[j] = nums[j + 1];
//                }
//                nums[firstZero] = 0;
//            }
//        }
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }

    }


}
