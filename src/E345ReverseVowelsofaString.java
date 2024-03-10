import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class E345ReverseVowelsofaString {
    public static String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
//        Stack<Character> stack = new Stack<>();
//        ArrayList<Integer> indexArr = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (vowels[s.charAt(i)]) {
//                stack.push(s.charAt(i));
//                indexArr.add(i);
//            }
//        }
        char[] temp = s.toCharArray();
//        for (Integer index : indexArr) {
//            temp[index] = stack.pop();
//        }
//        return String.valueOf(temp);
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (!vowels[s.charAt(left)] && left < right) left++;
            while (!vowels[s.charAt(right)] && right > left) right--;
            if (vowels[s.charAt(left)] && vowels[s.charAt(right)]) {
                char swap = s.charAt(left);
                temp[left] = temp[right];
                temp[right] = swap;
                // move the pointer
                left++;
                right--;
            }
        }
        return String.valueOf(temp);
    }

    public boolean isVowel(Character c) {
        if (c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u') || c.equals('A') || c.equals('E') || c.equals('I') || c.equals('O') || c.equals('U')) {
            return true;
        }
        return false;
    }

}
