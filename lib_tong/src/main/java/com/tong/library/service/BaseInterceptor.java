//package com.tong.library.service;
//
//import android.content.Context;
//
//import com.alibaba.android.arouter.facade.Postcard;
//import com.alibaba.android.arouter.facade.annotation.Interceptor;
//import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
//import com.alibaba.android.arouter.facade.template.IInterceptor;
//
///**
// * Created by hjt on 2019/1/24.
// */
//
//@Interceptor(priority = 1, name = "测试拦截")
//public class BaseInterceptor implements IInterceptor {
//    @Override
//    public void process(Postcard postcard, InterceptorCallback callback) {
//        if (postcard.getExtra() == 1) {
//            callback.onContinue(postcard);
//        } else {
//            callback.onContinue(postcard);
//        }
//    }
//
//    @Override
//    public void init(Context context) {
//
//    }
//}
