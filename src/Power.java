import java.util.Map;
import java.util.regex.Matcher;

/**
 * Created by chenwenping on 17/3/23.
 */
public class Power {

    public double power(double base, int exponent) {

        double result = 1;

        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        if (exponent < 0) {
            result = 1 / result;
        }

        return result;

    }

    private double test(double base, int n) {

        double result = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            result *= base;
        }

        if (n < 0) {
            result = result / 1;
        }

        return result;

    }
}
