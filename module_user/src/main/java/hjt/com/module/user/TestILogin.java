package hjt.com.module.user;

import com.tong.library.service.ILogin;

public class TestILogin implements ILogin {
    @Override
    public boolean isLogin() {
        return true;
    }
}
