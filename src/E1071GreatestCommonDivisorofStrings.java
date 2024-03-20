public class E1071GreatestCommonDivisorofStrings {
    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            int len = str1.length() > str2.length() ? gcd(str1.length(), str2.length()) : gcd(str2.length(), str1.length());
            return str1.substring(0, len);
        } else return "";
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else return gcd(b, a % b);
    }
}
