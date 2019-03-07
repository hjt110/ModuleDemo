package hjt.com.module.user;


import hjt.com.componentbase.ILogin;

public class TestILogin implements ILogin {
    @Override
    public boolean isLogin() {
        return true;
    }
}
