import java.util.*;

public class M3LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLength = 0;
        Set<Character> charset = new HashSet<>();
        while (right < s.length()) {
            if (!charset.add(s.charAt(right))) {
                maxLength = Math.max(maxLength, charset.size());
                while (!charset.add(s.charAt(right))) {
                    charset.remove(s.charAt(left));
                    left++;
                }
            }
            right++;
        }
        return Math.max(maxLength, charset.size());
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }
}
