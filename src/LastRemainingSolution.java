import java.util.ArrayList;

/**
 * Created by chenwenping on 17/3/23.
 */
public class LastRemainingSolution {

    public int lastRemaining(int n, int m) {

        if (n < 1 || m < 1) {
            return -1;
        }

        int[] array = new int[n];
        int count = n;
        int step = 0;
        int i = -1;

        while(count > 0) {
            i ++;     //人个数

            if (i >= n) {
                i = 0;
            }
            if (array[i] == -1) {
                continue;
            }

            step ++;  //步长

            if (step == m) {
                array[i] = -1;
                step = 0;
                count --;
            }
        }
        return i;
    }

    int LastRemaining_Solution(int n, int m) {
        if (m == 0 || n == 0) {
            return -1;
        }

        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        int index = -1;
        while (data.size() > 1) {
            System.out.println(data);
            index = (index + m) % data.size();
            System.out.println(data.get(index));
            data.remove(index);
            index--;
        }
        return data.get(0);
    }

    public int lastRemainingSolution(int n, int m) {
        if (m == 0 || n == 0) {
            return -1;
        }

        int s = 0;
        for (int i = 2; i <= n; i++) {
            s = (s + m) % i;
        }

        return s;

    }

    public int test(int n, int m) {

        if (n <= 1 || m <= 1) {
            return -1;
        }

        int count = n;
        int i = -1;
        int step = 0;
        int[] array = new int[n];

        while (count > 0) {
            i ++;

            if (i >= n) {
                i = 0;
            }

            if (array[i] == -1) {
                continue;
            }

            step ++;
            if (step == m) {
                array[i] = -1;
                count --;
                step = 0;
            }

        }
        return i;
    }



}
