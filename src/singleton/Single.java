package singleton;

/**
 * Created by chenwenping on 17/3/24.
 */
public class Single {
    private static Single instance = null;

    private Single() {
    }

    public static Single getInstance() {
        if (instance == null) {
            synchronized(Single.class) {
                if (instance == null) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}
