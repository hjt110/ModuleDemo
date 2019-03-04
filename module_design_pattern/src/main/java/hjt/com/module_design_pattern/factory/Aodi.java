package hjt.com.module_design_pattern.factory;

/**
 * Created by hjt on 2019/3/4.
 */

public class Aodi implements ICar {

    @Override
    public String describle() {
        return "我是奥迪";
    }

    @Override
    public String whell() {
        return "我有4个轮子喔~";
    }

    @Override
    public String weight() {
        return "跟大象差不多重吧";
    }
}
