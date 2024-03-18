/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number
 * 1 if num is lower than the picked number
 * otherwise return 0
 * int guess(int num);
 */
public class E374GuessNumberHigherLower {
    int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        while (guess(n) == -1) n--;
        while (guess(n) == 1) n++;
        return n;
    }

}
