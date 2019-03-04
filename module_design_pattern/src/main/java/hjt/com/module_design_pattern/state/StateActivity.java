package hjt.com.module_design_pattern.state;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tong.library.base.BaseActivity;

import butterknife.OnClick;
import hjt.com.module_design_pattern.R;
import hjt.com.module_design_pattern.R2;

@Route(path = "/design/state")
public class StateActivity extends BaseActivity {

    @Override
    protected int getLayoutResID() {
        return R.layout.design_activity_state;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @Override
    protected void initEvent() {

    }

    @OnClick({R2.id.tv_functionA, R2.id.tv_functionB, R2.id.tv_functionC})
    public void myClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_functionA) {
            StateController.getInstance().functionA();
        } else if (id == R.id.tv_functionB) {
            StateController.getInstance().functionB();
        } else if (id == R.id.tv_functionC) {
            StateController.getInstance().functionC();
        }
    }
}
