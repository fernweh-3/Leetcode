public class E605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int pointer = 0;
        while (pointer < flowerbed.length && n > 0) {
            if (flowerbed[pointer] == 1) {
                if (pointer == flowerbed.length - 1 || flowerbed[pointer + 1] == 0) {
                    pointer += 2;
                } else pointer++;
            } else if (flowerbed[pointer] == 0) {
                if (pointer == flowerbed.length - 1 || flowerbed[pointer + 1] == 0) {
                    n--;
                    pointer += 2;
                } else pointer++;
            }
        }
        return n == 0;
    }

}
