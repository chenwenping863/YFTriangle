/**
 * Created by chenwenping on 17/3/23.
 */
public class Fibonacci {

    public int fibonacci1(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci1(n - 1) + fibonacci1(n - 2);

    }

    public int fibonacci2(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int fn1 = 0;
        int fn2 = 1;
        int currentnum = 0;

        for (int i = 2; i <= n; i++) {
            currentnum = fn1 + fn2;
            fn1 = fn2;
            fn2 = currentnum;
        }


        return currentnum;

    }
}
