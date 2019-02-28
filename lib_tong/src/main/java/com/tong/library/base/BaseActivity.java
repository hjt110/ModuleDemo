package com.tong.library.base;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.tong.library.mvp.IBaseView;
import com.tong.library.utils.StatusBarCompat;
import com.tong.library.utils.permission.ScreenUtils;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity implements IBaseView, StatusBarIml {

    private Unbinder mUnbinder;
    private Activity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (ScreenUtils.isPortrait()) {
            ScreenUtils.adaptScreen4VerticalSlide(this, 360);
        } else {
            ScreenUtils.adaptScreen4HorizontalSlide(this, 360);
        }
        initFirst();
        setContentView(getLayoutResID());
        mUnbinder = ButterKnife.bind(this);
        activity = this;
        if (isUseEventBus()) {
            EventBus.getDefault().register(this);
        }
        if (!isMvp()) {
            init(savedInstanceState);
            initEvent();
        }

    }

    protected void initFirst() {
    }


    @Override
    public void setStatusBarColor(int color) {
        StatusBarCompat.setColorNoTranslucent(this, getResources().getColor(color));
    }

    @Override
    public void setStatusBarIcon(boolean isDark) {
        if (isDark) {
            StatusBarCompat.darkMode(this, true);
        } else {
            StatusBarCompat.darkMode(this, false);
        }
    }

    protected abstract int getLayoutResID();

    protected abstract void init(Bundle savedInstanceState);

    protected abstract void initEvent();

    public Activity getActivity() {
        return activity;
    }

    protected boolean isUseEventBus() {
        return false;
    }

    public void show(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


    @Override
    protected void onDestroy() {
        ScreenUtils.cancelAdaptScreen(this);
        super.onDestroy();
        mUnbinder.unbind();
        if (isUseEventBus()) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    protected boolean isMvp() {
        return false;
    }

    @Override
    public Context getContext() {
        return this;
    }
}
