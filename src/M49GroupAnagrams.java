import java.util.*;

public class M49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            byte[] temp = strs[i].getBytes();
            Arrays.sort(temp);
            ArrayList<String> element = map.getOrDefault(Arrays.toString(temp),
                    new ArrayList<String>());
            element.add(strs[i]);
            map.put(Arrays.toString(temp), element);
        }
        return new ArrayList<>(map.values());
    }
}
