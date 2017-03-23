package singleton;

/**
 * Created by chenwenping on 17/3/23.
 */
public class Singleton4 {
    //静态内部内。（建议使用）
    /**
     * 定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。
     * 而类型为SingletonHolder的类，只有在Singleton.getInstance()中调用，
     * 由于私有的属性，他人无法使用SingleHolder，
     * 不调用Singleton.getInstance()就不会创建实例。
     * 优点：达到了lazy loading的效果，即按需创建实例。
     */

    private Singleton4() {

    }

    private static class SingletonHolder {

        private final static Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {

        return SingletonHolder.instance;
    }
}
