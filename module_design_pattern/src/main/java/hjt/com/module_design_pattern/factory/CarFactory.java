package hjt.com.module_design_pattern.factory;

/**
 * Created by hjt on 2019/3/4.
 */

public class CarFactory extends Factory {

    @Override
    public <T extends ICar> T creatCar(Class<T> cls) {
        ICar iCar = null;
        try {
            iCar = (ICar) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) iCar;
    }
}
