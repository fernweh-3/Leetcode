import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class E136SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) map.remove(nums[i]);
            else map.put(nums[i], 1);
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        return iterator.next();
    }
}

