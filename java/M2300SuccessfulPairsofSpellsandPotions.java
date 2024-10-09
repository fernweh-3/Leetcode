import java.util.Arrays;

public class M2300SuccessfulPairsofSpellsandPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        long[] quotient = new long[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            if (success % spells[i] != 0) {
                quotient[i] = success / spells[i] + 1;
            } else {
                quotient[i] = success / spells[i];
            }

            if (quotient[i] <= potions[0])
                result[i] = potions.length;
            else if (quotient[i] > potions[potions.length - 1])
                result[i] = 0;
            else {
                result[i] = indexBinarySearch(0, potions.length - 1, potions, quotient[i]);
            }
        }
        return result;
    }

    int indexBinarySearch(int low, int high, int[] arr, long target) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (target > arr[mid])
                low = mid + 1;
            else
                high = mid;
        }
        return arr.length - low;
    }
}
