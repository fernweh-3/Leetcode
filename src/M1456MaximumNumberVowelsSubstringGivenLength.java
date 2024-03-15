import java.util.HashSet;
import java.util.Set;

public class M1456MaximumNumberVowelsSubstringGivenLength {

    public int maxVowels(String s, int k) {
            int current = 0;
            for (int i = 0; i < k; i++) {
                if (isVowel(s.charAt(i)))
                    current++;
            }
            int max = current;
            for (int i = 1; i < s.length() - k + 1; i++) {
                if (isVowel(s.charAt(i - 1)))  current--;
                if (isVowel(s.charAt(i + k - 1)))
                    current++;

                max = Math.max(max, current);
                if (max == k)
                    return max;
            }
            return max;

        }

        boolean isVowel(char c) {
            return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
        }
}
