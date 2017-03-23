import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenwenping on 17/3/23.
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i ++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            } else {
                list.remove(new Integer(array[i]));
            }
        }

        if (list.size() > 1) {
            num1[0] = list.get(0);
            num2[0] = list.get(1);
        }
    }

    private void  test(int [] array,int num1[] , int num2[]) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (!list.contains(i)) {
                list.add(i);
            } else {
                list.remove(new Integer(i));
            }
        }

        if (list.size() > 1) {
            num1[0] = list.get(0);
            num2[0] = list.get(1);
        }
    }
}
