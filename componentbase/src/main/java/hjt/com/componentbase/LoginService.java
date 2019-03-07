package hjt.com.componentbase;

public class LoginService {

    private static LoginService mLoginService;
    private ILogin mILogin = new NoLogin();
    private LoginService(){

    }

    public static LoginService getInstance(){
        if (mLoginService==null){
            mLoginService = new LoginService();
        }
        return mLoginService;
    }

    public void setLogin(ILogin iLogin){
        mILogin = iLogin;
    }

    public boolean isLogin(){
        return mILogin.isLogin();
    }

}
