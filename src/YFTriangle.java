
import java.util.Scanner;

/**
 * Created by chenwenping on 17/3/6.
 */
public class YFTriangle {




    /**
     * 1 要理解下面的实现，首先要明白int数组中元素默认值为 0
     * 2 然后每一次迭代打印新的一行的元素的时候：
     * 新的特定位置的元素 = 该位置原来的元素 + 该位置的前一个位置的值
     */
    public static void printYFTriangle() {
        System.out.println("lines:");
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        int[] a = new int[lines + 1];
        int previous = 1;
        for (int i = 1; i <= lines; i ++) {
            for (int j = 1; j <= i; j++) {
                int current = a[j];
                a[j] = previous + current;
                previous = current;
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }

    /*public  void  test (int len) {

        int[] arr = new int[len + 1];
        int pre = 1;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                int current = arr[j];
                arr[j] = pre + current;
                pre = current;
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

    }*/
}
