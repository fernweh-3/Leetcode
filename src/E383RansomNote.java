import java.util.HashMap;
import java.util.Objects;

public class E383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> noteMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        boolean result = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            noteMap.put(ransomNote.charAt(i), noteMap.containsKey(ransomNote.charAt(i)) ? noteMap.get(ransomNote.charAt(i)) + 1 : 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.containsKey(magazine.charAt(i)) ? magazineMap.get(magazine.charAt(i)) + 1 : 1);
        }
        for (Character character : noteMap.keySet()) {
            if (!(magazineMap.containsKey(character) && magazineMap.get(character) >= noteMap.get(character))) {
                result = false;
            }
        }
        return result;
    }
}
