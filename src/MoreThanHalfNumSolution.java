import java.util.HashMap;

/**
 * Created by chenwenping on 17/3/23.
 */
public class MoreThanHalfNumSolution {

    public int MoreThanHalfNum_Solution(int [] array) {

        if (array == null || array.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer temp = map.get(array[i]);

            if (temp == null) {
                map.put(array[i], 1);
                temp = 1;

            } else {
                map.put(array[i], temp + 1);
            }


            if (temp + 1 > array.length / 2) {
                return array[i];
            }

        }

        return 0;


    }

}
