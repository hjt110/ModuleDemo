package com.tong.library.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by hjt on 2019/1/24.
 */

@Route(path = "/main/mainservice")
public class MainModuleServiceIml implements IMainModuleService {
    @Override
    public String getMsg() {
        return "lallallall";
    }

    @Override
    public void setMsg(String msg) {

    }

    @Override
    public void init(Context context) {

    }
}
