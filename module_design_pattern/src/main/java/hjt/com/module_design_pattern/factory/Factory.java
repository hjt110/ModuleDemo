package hjt.com.module_design_pattern.factory;

/**
 * Created by hjt on 2019/3/4.
 */

public abstract class Factory {
    public abstract <T extends ICar> T creatCar(Class<T> cls);
}
