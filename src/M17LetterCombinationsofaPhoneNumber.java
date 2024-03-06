import java.util.*;

public class M17LetterCombinationsofaPhoneNumber {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;

        result = getMap(digits.charAt(0));
        for (int i = 1; i < digits.length(); i++) {
            combine(result, getMap(digits.charAt(i)));
        }
        return result;

    }

    List<String> getMap(Character digit) {
        ArrayList<String> result = new ArrayList<>();
        if (digit.equals('2')) {
            result.addAll(List.of("a", "b", "c"));
        }
        if (digit.equals('3')) {
            result.addAll(List.of("d", "e", "f"));
        }
        if (digit.equals('4')) {
            result.addAll(List.of("g", "h", "i"));
        }
        if (digit.equals('5')) {
            result.addAll(List.of("j", "k", "l"));
        }
        if (digit.equals('6')) {
            result.addAll(List.of("m", "n", "o"));
        }
        if (digit.equals('7')) {
            result.addAll(List.of("p", "q", "r", "s"));
        }
        if (digit.equals('8')) {
            result.addAll(List.of("t", "u", "v"));
        }
        if (digit.equals('9')) {
            result.addAll(List.of("w", "x", "y", "z"));
        }
        return result;
    }

    void combine(List<String> a, List<String> b) {
        List<String> temp = List.copyOf(a);
        a.clear();
        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                a.add(temp.get(i) + b.get(j));
            }
        }
    }
}
