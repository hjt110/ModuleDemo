package com.tong.library.mvp;

import android.content.Context;

/**
 * Created by Tong on 2018/4/23.
 */

public interface IBaseView {

    void showLoading();

    void hideLoading();

    Context getContext();

}
