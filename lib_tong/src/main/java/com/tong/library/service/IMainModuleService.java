package com.tong.library.service;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by hjt on 2019/1/24.
 */

public interface IMainModuleService extends IProvider {

    String getMsg();

    void setMsg(String msg);
}
