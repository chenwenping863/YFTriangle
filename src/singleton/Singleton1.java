package singleton;

/**
 * Created by chenwenping on 17/3/23.
 */
public class Singleton1 {
    //多线程的情况可以用。（懒汉式，不好）
    /**
     * 在解法一的基础上加上了同步锁，使得在多线程的情况下可以用。
     * 例如：当两个线程同时想创建实例，
     * 由于在一个时刻只有一个线程能得到同步锁，
     * 当第一个线程加上锁以后，第二个线程只能等待。
     * 第一个线程发现实例没有创建，创建之。第一个线程释放同步锁，
     * 第二个线程才可以加上同步锁，执行下面的代码。
     * 由于第一个线程已经创建了实例，
     * 所以第二个线程不需要创建实例。
     * 保证在多线程的环境下也只有一个实例。
     缺点：每次通过getInstance方法得到singleton实例的时候都有一个试图去获取同步锁的过程。
     而众所周知，加锁是很耗时的。能避免则避免。*/
    private static Singleton1 instance = null;

    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
