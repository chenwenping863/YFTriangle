package string;

/**
 * Created by chenwenping on 17/3/23.
 */
public class CheckDifferent {

    public boolean checkDiff(String str) {
        if (str == null || str.length() ==0 || str.length() > 256) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if ((str.charAt(i) ^ str.charAt(j)) == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
