/**
 * Created by chenwenping on 17/3/23.
 */
public class NumberOf1 {
    public int NumberOf1(int n) {

        int count = 0;
        while (n != 0) {
            count ++;
            n = n & (n - 1);
        }

        return count;

    }
}

