package hjt.com.module_design_pattern.state;

import android.os.Bundle;
import android.view.View;

import com.tong.library.base.BaseActivity;

import butterknife.OnClick;
import hjt.com.module_design_pattern.R;
import hjt.com.module_design_pattern.R2;

public class StateActivity extends BaseActivity {

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_state;
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

        } else if (id == R.id.tv_functionB) {

        } else if (id == R.id.tv_functionC) {

        }
    }
}
