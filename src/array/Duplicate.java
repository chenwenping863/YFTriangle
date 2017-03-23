package array;

/**
 * Created by chenwenping on 17/3/23.
 */
public class Duplicate {

    public boolean duplicate(int numbers[],int length,int [] duplication) {

        boolean[] k = new boolean[length];

        for (int i = 0; i < length; i ++) {

            if (k[numbers[i]] == true) {

                duplication[0] = numbers[i];
                return true;

            }
            k[numbers[i]] = true;

        }
        return false;

    }
}
