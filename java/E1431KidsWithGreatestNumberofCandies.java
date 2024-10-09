import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class E1431KidsWithGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(true);
            } else list.add(false);
        }
        return list;
    }
}
