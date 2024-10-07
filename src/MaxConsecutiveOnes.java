public class MaxConsecutiveOnes {
    /**
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     * Example 2:
     *
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     *
     *
     * Constraints:
     *
     * 1 <= nums.length <= 105
     * nums[i] is either 0 or 1.
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
/**
 * if (count > max) {
 *                     max = count;
 *                 }
 *  This can be replaced by max = Math.max(max, count);
 *  and where to put this line can affect the performance of the code.
 */