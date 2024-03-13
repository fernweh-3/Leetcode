public class E1768MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());
        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if (i / 2 == word1.length()) {
                sb.append(word2.substring(i / 2));
                return sb.toString();
            } else if (i / 2 == word2.length()) {
                sb.append(word1.substring(i / 2));
                return sb.toString();
            } else {
                if (i % 2 == 0) sb.append(word1.charAt(i / 2));
                else sb.append(word2.charAt(i / 2));
            }
        }
        return sb.toString();
    }
}
