
import java.util.Arrays;

public class M875KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        long left = 1;
        long right = piles[piles.length - 1];

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canEatInTime(piles, mid, h))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return (int) left;
    }

    public boolean canEatInTime(int piles[], long k, long h) {
        long hours = 0;
        for (int pile : piles) {
            long div = pile / k;
            hours += div;
            if (pile % k != 0)
                hours++;
        }
        return hours <= h;
    }
}
