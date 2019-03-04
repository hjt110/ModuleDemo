package hjt.com.module_design_pattern.single;

/**
 * Created by hjt on 2019/3/4.
 */

public class Singleton {

    private static Singleton mSingleton;

    /**
     * 1.构造函数不对外开发，一般为private
     */
    private Singleton() {
    }

    /**
     * 2.通过一个静态的方法或枚举返回单例
     * 3.采用DCL(Double Check Lock)模式，确保对象单例的对象有且只有一个，尤其是在多线程的环境下
     *
     * @return
     */
    public static Singleton getInstance() {
        if (mSingleton == null) {
            synchronized (Singleton.class) {
                if (mSingleton == null) {
                    mSingleton = new Singleton();
                }
            }
        }
        return mSingleton;
    }
}
