package hjt.com.module.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tong.library.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = "/main/main")
public class MainActivity extends BaseActivity {


    @BindView(R2.id.tv)
    TextView tv;
    @BindView(R2.id.tv_test)
    TextView tvTest;

    @Override
    protected int getLayoutResID() {
        return R.layout.main_activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @Override
    protected void initEvent() {

    }

    @OnClick({R2.id.tv, R2.id.tv_test})
    public void onClick(View view) {
        if (view.getId() == R.id.tv) {
            ARouter.getInstance().build("/user/second").withString("key", "见鬼").navigation();
//            startActivity(new Intent(this,TestActivity.class));
        } else if (view.getId() == R.id.tv_test) {
            startActivity(new Intent(this, TestActivity.class));
        }
    }

}
