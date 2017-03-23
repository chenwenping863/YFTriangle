import java.util.ArrayList;
import java.util.HashMap;

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
}
