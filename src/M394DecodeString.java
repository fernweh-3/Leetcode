import java.util.Stack;

public class M394DecodeString {
    public static String decodeString(String s) {

        Stack<Integer> nums = new Stack<>();
        Stack<String> strs = new Stack<>();
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                nums.push(temp);
                temp = 0;
                strs.push(sb.toString());
                sb = new StringBuilder();
            } else if (ch == ']') {
                String strToRepeat = sb.toString();

                int repeat = nums.pop();
                String prefix = strs.pop();

                // sb: prefix + repeat * strToRepeat
                sb.insert(0, prefix);
                for (int i = 1; i < repeat; i++) {
                    sb.append(strToRepeat);
                }
            } else if (Character.isDigit(ch)) {
                temp = temp * 10 + (ch - '0');
            } else {
                // is alphabetic
                sb.append(ch);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}
