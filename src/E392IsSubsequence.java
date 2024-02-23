public class E392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = 0;
        boolean result = false;
        while (sPointer < s.length() && tPointer < t.length()) {
            if (t.charAt(tPointer) == s.charAt(sPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        if (sPointer == s.length() && tPointer <= t.length()) {
            result = true;
        }
        return result;
    }
}
