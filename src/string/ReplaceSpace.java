package string;

/**
 * Created by chenwenping on 17/3/22.
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }

        String string = str.toString();

        StringBuffer strTemp = new StringBuffer();

        for (int i = 0; i < str.length(); i ++) {
            if (string.charAt(i) == ' ') {
                strTemp.append("%20");
            } else {
                strTemp.append(string.charAt(i));
            }

        }

        return strTemp.toString();
    }
}
