package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenwenping on 17/3/23.
 */
public class CheckSam {

    public boolean checkSam(String stringA, String stringB) {
        if (stringA == null || stringB == null || stringA.length() <= 0 || stringB.length() <= 0) {
            return false;
        }

        if (stringA.length() != stringB.length()) {
            return false;
        }

        Map<Character, Integer> tempMap = new HashMap();

        for (int i = 0; i < stringA.length(); i++) {
            if (!tempMap.containsKey(stringA.charAt(i))) {
                tempMap.put(stringA.charAt(i), 1);
            } else {
                tempMap.put(stringA.charAt(i), tempMap.get(stringA.charAt(i)) + 1);
            }
        }


        for (int i = 0; i < stringB.length(); i++) {
            if (tempMap.containsKey(stringB.charAt(i))) {
                tempMap.remove(stringB.charAt(i));
            }

        }

        return tempMap.isEmpty();

    }
}
