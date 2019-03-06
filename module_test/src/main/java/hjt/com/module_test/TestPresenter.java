package hjt.com.module_test;

import android.os.Handler;
import android.os.Message;

import com.tong.library.mvp.BasePresenter;

/**
 * Created by hjt on 2019/3/6.
 */

public class TestPresenter extends BasePresenter<TestConstract.View> implements TestConstract.Persenter {

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            getView().showsdsddf();
        }
    };

    public void init() {
        mHandler.sendEmptyMessageDelayed(1, 5000);
    }
}
