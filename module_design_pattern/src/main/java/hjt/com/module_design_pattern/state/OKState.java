package hjt.com.module_design_pattern.state;

import android.widget.Toast;

import com.tong.library.base.BaseApplication;

/**
 * Created by hjt on 2019/3/4.
 */

public class OKState implements IState {
    @Override
    public void functionA() {
        Toast.makeText(BaseApplication.getApplication(),"functionA",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void functionB() {
        Toast.makeText(BaseApplication.getApplication(),"functionB",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void functionC() {
        Toast.makeText(BaseApplication.getApplication(),"functionC",Toast.LENGTH_SHORT).show();
    }
}
