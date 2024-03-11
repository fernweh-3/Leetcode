
import java.util.Arrays;

public class M875KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);
        int cycles = h / piles.length;
        int remainder = h % piles.length;
        if (cycles == 1) return piles[piles.length - 1 - remainder];
        else{

        }
    }
}
