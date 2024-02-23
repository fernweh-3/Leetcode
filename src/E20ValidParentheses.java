import java.util.Stack;

public class E20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(' || stack.empty()) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ']' && stack.pop() != '[') {
                return false;
            } else if (s.charAt(i) == ')' && stack.pop() != '(') {
                return false;
            } else if (s.charAt(i) == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.empty();

    }
}
