package com.tong.library.base;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;
import com.tong.library.BuildConfig;

/**
 * Created by hjt on 2019/1/23.
 */

public class BaseApplication extends Application {

    private static BaseApplication mBaseApplication;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        mBaseApplication = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        intARouter();
    }

    private void intARouter() {
        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(mBaseApplication); // 尽可能早，推荐在Application中初始化
    }

    /**
     * 获取全局唯一Application
     *
     * @return
     */
    public static BaseApplication getApplication() {
        return mBaseApplication;
    }
}
