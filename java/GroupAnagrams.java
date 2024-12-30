public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String s:strs){
                int[] charArray = new int[26];
                for (char c: s.toCharArray()){
                    charArray[c -'a']++;
                }
                String key = Arrays.toString(charArray);
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(s);
            }
            return new ArrayList<>(map.values());
        }
    }
}
