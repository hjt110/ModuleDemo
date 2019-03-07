package com.tong.library.base;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.alibaba.android.arouter.launcher.ARouter;
import com.squareup.leakcanary.LeakCanary;
import com.tong.library.BuildConfig;

/**
 * Created by hjt on 2019/1/23.
 */

public abstract class BaseApplication extends Application {

    private static BaseApplication mBaseApplication;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        mBaseApplication = this;
        //MultiDex分包方法 必须最先初始化
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
        initLeakCanary();
        initModule();
    }

    /**
     * 初始化各个module的BaseApplication(若module有想在自己module实现的初始化)
     */
    public abstract void initModule();

    private void initARouter() {
        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(mBaseApplication); // 尽可能早，推荐在Application中初始化
    }

    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
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
