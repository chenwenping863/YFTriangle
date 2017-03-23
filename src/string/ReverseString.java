package string;

/**
 * Created by chenwenping on 17/3/23.
 */
public class ReverseString {
    public String reverseString(String iniString) {
        // write code here
        String str = "";
        for (int i = iniString.length() - 1  ; i >= 0; i--) {

            char c = iniString.charAt(i);
            str = str + c;
        }

        return str;
    }
}
