import java.util.ArrayList;

public class M1493LongestSubarrayAfterDeletingOneElement {


    public static int longestSubarray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (nums[i] == 1) count++;
                list.add(count);
            } else {
                if (nums[i] == 0) {
                    list.add(count);
                    count = 0;
                } else count++;
            }
        }
        System.out.println(list);
        if (list.isEmpty() || list.size() == 1) return nums.length - 1;
        else {
            int max = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                max = Math.max(max, list.get(i) + list.get(i + 1));
            }
            return max;
        }
    }

    public static void main(String[] args) {
        longestSubarray(new int[]{1,1,0,0});
    }
}
