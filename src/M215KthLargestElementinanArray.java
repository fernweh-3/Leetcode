import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class M215KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {

                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();
    }


}

