import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num:nums){
            count.put(num, count.getOrDefault(num,0) + 1);
        }

//        use Lambda (a,b)-> a[0]-b[0] to sort the array by the first element in descending order
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b)-> a[0]-b[0]);

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if (heap.size()> k){
                heap.poll(); // remove the smallest element
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = heap.poll()[1];
        }
        return res;

    }

//    Bucket sort
    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for (int n:nums){
            count.put(n, count.getOrDefault(n,0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length -1; i >= 0 && index < k; i--){
            for (int n : freq[i]){
                res[index++] = n;
                if (index ==k){
                    return res;
                }
            }
        }
        return res;
    }
}
