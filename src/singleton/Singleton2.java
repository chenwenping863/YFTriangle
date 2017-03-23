package singleton;

/**
 * Created by chenwenping on 17/3/23.
 */
public class Singleton2 {
    //加同步锁时，前后两次判断实例是否存在（可行）
    /**
     * 只有当instance为null时，需要获取同步锁，创建一次实例。
     * 当实例被创建，则无需试图加锁。
     缺点：用双重if判断，复杂，容易出错。*/
    private static Singleton2 instance = null;
    private Singleton2() {

    }
    public static Singleton2 getInstance() {

        if (instance == null) {
            synchronized( Singleton2.class) {

                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
