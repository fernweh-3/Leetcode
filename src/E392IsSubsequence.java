public class E392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
//        int sPointer = 0, tPointer = 0;
//        boolean result = false;
//        while (sPointer < s.length() && tPointer < t.length()) {
//            if (t.charAt(tPointer) == s.charAt(sPointer)) {
//                sPointer++;
//            }
//            tPointer++;
//        }
//        if (sPointer == s.length() && tPointer <= t.length()) {
//            result = true;
//        }
//        return result;

        if  (s.length()==0) return true;
        if  (t.length()==0) return false;
        int sPointer = 0, tPointer = 0;
        while (tPointer < t.length()&&sPointer < s.length()) {
            if (t.charAt(tPointer) == s.charAt(sPointer)) {
                tPointer++;
                sPointer++;
            } else {
                tPointer++;
            }
        }
        return sPointer==s.length();
    }
}
