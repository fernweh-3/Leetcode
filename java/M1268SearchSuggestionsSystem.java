import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M1268SearchSuggestionsSystem {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            result.add(new ArrayList<>());
        }
        Arrays.sort(products);

        ArrayList<String> pointers = new ArrayList<>();
        for (int i = 0; i < products.length; i++) {
            pointers.add(products[i]);
        }
        for (int i = 0; i < searchWord.length(); i++) {
            int count = 0, j = 0;
            while (count < 3 && j < pointers.size()) {
                if (pointers.get(j).startsWith(searchWord.substring(0, i + 1))) {
                    count++;
                    result.get(i).add(pointers.get(j));
                    j++;
                } else {
                    pointers.remove(j);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse");
    }
}
