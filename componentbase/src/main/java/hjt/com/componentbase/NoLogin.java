package hjt.com.componentbase;

public class NoLogin implements ILogin {
    @Override
    public boolean isLogin() {
        return false;
    }
}
