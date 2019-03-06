package hjt.com.module_test;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tong.library.mvp.BaseMvpActivity;

@Route(path = "/test/test")
public class TestActivity extends BaseMvpActivity<TestPresenter> implements TestConstract.View {

    @Override
    protected int getLayoutResID() {
        return R.layout.test_activity_test;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected TestPresenter initPresenter() {
        return new TestPresenter();
    }

    @Override
    public void showsdsddf() {
    }
}
