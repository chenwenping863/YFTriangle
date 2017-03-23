/**
 * Created by chenwenping on 17/3/23.
 */
public class StrToInt {
    public int strToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        char[] charStr = str.toCharArray();

        int fuhao = 0;
        if (charStr[0] == '-') {
            fuhao = 1;
        }

        int sum = 0;

        for (int i = fuhao; i < str.length(); i++) {
            if (charStr[i] == '+') {
                continue;
            }

            if (charStr[i] < 48 || charStr[i] > 57) {
                return 0;
            }

            sum = sum*10 + charStr[i] - '0';
        }

        return fuhao == 1 ? sum * -1 : sum;


    }

    private int test(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        char[] chars = str.toCharArray();

        int flag = 0;
        if (chars[0] == '-') {
            flag = 1;
        }
        int sum = 1;

        for (char c : chars) {
            if (c == '+') {
                continue;
            }

            if (c < '0' || c > '9') {
                return -1;
            }
            sum = sum * 10 + c - '0';
        }

        return flag == 1 ? sum * -1 : sum;
    }
}
