package com.tong.library.service;

public class NoLogin implements ILogin {
    @Override
    public boolean isLogin() {
        return false;
    }
}
