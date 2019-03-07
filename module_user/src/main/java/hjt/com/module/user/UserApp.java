package hjt.com.module.user;

import com.tong.library.base.BaseApplication;

import hjt.com.componentbase.LoginService;

public class UserApp extends BaseApplication {
    @Override
    public void initModule() {
        LoginService.getInstance().setLogin(new TestILogin());
    }
}
