import java.util.Arrays;

public class M443StringCompression {
    public static int compress(char[] chars) {
        if (chars.length == 1) return 1;
        int left = 0, right = 1, count = 1, length = 0;
        while (right < chars.length) {
            if (chars[left] != chars[right]) {
                length++;
                if (count != 1) {
                    for (int i = 0; i < String.valueOf(count).length(); i++) {
                        chars[length] = String.valueOf(count).charAt(i);
                        length++;
                    }
                }
                chars[length] = chars[right];
                left = right;
                count = 1;
            } else {
                count++;
            }
            right++;
        }
        length++;
        if (count != 1) {
            for (int i = 0; i < String.valueOf(count).length(); i++) {
                chars[length] = String.valueOf(count).charAt(i);

                length++;
            }
        }
        return length;
    }

}
