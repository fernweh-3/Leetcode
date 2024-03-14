import java.util.Stack;

public class M2390RemovingStarsFromString {
    public String removeStars(String s) {
//        Stack<Character> characterStack = new Stack<>();
//        for (char c : s.toCharArray()) {
//            if (c == '*') {
//                characterStack.pop();
//            } else {
//                characterStack.push(c);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        while (!characterStack.isEmpty()) {
//            sb.insert(0, characterStack.pop());
//
//        }
//        return sb.toString();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.delete(sb.length() - 1, sb.length());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
