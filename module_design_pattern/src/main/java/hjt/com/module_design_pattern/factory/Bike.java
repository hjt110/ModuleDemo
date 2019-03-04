package hjt.com.module_design_pattern.factory;

/**
 * Created by hjt on 2019/3/4.
 */

public class Bike implements ICar {

    @Override
    public String describle() {
        return "我是自行车";
    }

    @Override
    public String whell() {
        return "我有2个轮子";
    }

    @Override
    public String weight() {
        return "大概几十斤吧";
    }
}
