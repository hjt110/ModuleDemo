package com.tong.library.mvp;

import java.lang.ref.WeakReference;

/**
 * Created by Tong on 2018/4/23.
 */

public abstract class BasePresenter<V extends IBaseView> {

    private WeakReference<V> mWeakReference;

    public void attachView(V view) {
        mWeakReference = new WeakReference<>(view);
    }

    public V getView() {
        if (mWeakReference!=null)return mWeakReference.get();
        return null;
    }

    public void detachView() {
        if (mWeakReference != null) {
            mWeakReference.clear();
            mWeakReference = null;
        }
    }

}
