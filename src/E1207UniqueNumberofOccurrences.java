import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class E1207UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Integer value : map.values()) {
            if (set.contains(value)) return false;
            set.add(value);
        }
        return true;

    }
}
