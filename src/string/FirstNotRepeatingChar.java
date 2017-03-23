package string;

/**
 * Created by chenwenping on 17/3/23.
 */
public class FirstNotRepeatingChar {

    public int firstNotRepeatingChar(String str) {

        if (str == null || str.length() == 0) {
            return -1;
        }

        char[] charStr = str.toCharArray();
        int[] charTemp = new int['z' + 1];

        for (char c : charStr) {
            charTemp[(int)c]++;
        }

        for (int i = 0; i < charTemp.length; i++) {
            if (charTemp[(int)charStr[i]] == 1) {
                return i;
            }
        }

        return -1;
    }
}
