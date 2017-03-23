import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenwenping on 17/3/23.
 */
public class FirstAppearingOnce {

    //Insert one char from stringstream
    HashMap<Character, Integer> map = new HashMap<>();
    ArrayList<Character> list = new ArrayList<>();

    public void Insert(char ch) {

        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }

        list.add(ch);


    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {	char temp = '#';
        for (char c : list) {
            if (map.get(c) == 1) {
                temp = c;
                break;
            }
        }
        return temp;
    }

    public char test(String str) {

         char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            list.add(c);
        }

        for (char c : list) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '#';
    }

}
