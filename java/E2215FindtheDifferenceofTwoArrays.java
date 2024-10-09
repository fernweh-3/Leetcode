import java.util.*;

public class E2215FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                set1.remove(i);
                set3.add(i);
            } else if (!set1.contains(i) && !set3.contains(i)) {
                set2.add(i);
            }
        }
        for (Integer integer : set1) {
            list1.add(integer);
        }
        for (Integer integer : set2) {
            list2.add(integer);
        }
        result.add(list1);
        result.add(list2);
        return result;

    }
}
