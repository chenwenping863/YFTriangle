package array;

/**
 * Created by chenwenping on 17/3/23.
 */
public class GetNumberOfK {
    //====================================================
    public int getNumberOfK(int [] array , int k) {

        if (array == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                count ++;
            }
        }

        return count;

    }

    //=====================================================
    public int getNumberOfK2(int [] array , int k) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int frist = getFristIndex(array, k);
        int last = getLastIndex(array, k);

        if (frist == -1 || last == -1) {
            return -1;
        }

        return last - frist + 1;


    }

    private int getFristIndex(int [] array , int k) {
        int start = 0;
        int end = array.length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {
            if (array[mid] < k) {
                start = mid + 1;
            } else {
                end = mid -1;
            }

            mid = (start + end) / 2;
        }

        System.out.print(start);

        return start;


    }

    private int getLastIndex(int [] array , int k) {
        int start = 0;
        int end = array.length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {
            if (array[mid] <= k) {
                start = mid + 1;
            } else {
                end = mid -1;
            }

            mid = (start + end) / 2;
        }
        System.out.print(end);
        return end;
    }
}
