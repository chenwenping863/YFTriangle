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
}
