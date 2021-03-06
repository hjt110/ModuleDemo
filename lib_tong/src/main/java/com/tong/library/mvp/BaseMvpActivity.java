package com.tong.library.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tong.library.base.BaseActivity;
import com.tong.library.mvp.BasePresenter;
import com.tong.library.mvp.IBaseView;

public abstract class BaseMvpActivity<P extends BasePresenter> extends BaseActivity implements IBaseView{

    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = initPresenter();
        mPresenter.attachView(this);
        init(savedInstanceState);
        initEvent();
    }

    protected abstract P initPresenter();

    protected P getP(){
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        if (mPresenter!=null){
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    @Override
    public void showLoading() {
        super.showLoading();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    protected boolean isMvp() {
        return true;
    }
}
