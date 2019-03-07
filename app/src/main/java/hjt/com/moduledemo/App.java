package hjt.com.moduledemo;

import com.tong.library.base.BaseApplication;

import java.lang.reflect.Method;

import hjt.com.componentbase.constant.APPConfig;

/**
 * Created by hjt on 2019/1/23.
 */

public class App extends BaseApplication {
    @Override
    public void initModule() {
        for (String clsName : APPConfig.mudule)
            try {
                BaseApplication app = (BaseApplication) Class.forName(clsName).newInstance();
                app.initModule();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
