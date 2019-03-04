package hjt.com.module_design_pattern.state;

import android.widget.Toast;

import com.tong.library.base.BaseApplication;

/**
 * Created by hjt on 2019/3/4.
 */

public class GGState implements IState {
    private int i = 0;

    @Override
    public void functionA() {
        initChange(0);
    }

    @Override
    public void functionB() {
        initChange(1);
    }

    @Override
    public void functionC() {
        initChange(2);
    }

    private void initChange(int function) {
        if (i < 5) {
            i++;
            Toast.makeText(BaseApplication.getApplication(), "累计点击5下，状态改变。 当前第" + i + "次", Toast.LENGTH_SHORT).show();
        } else {
            i = 0;
            StateController.getInstance().setState(new OKState());
            switch (function) {
                case 0:
                    StateController.getInstance().functionA();
                    break;
                case 1:
                    StateController.getInstance().functionB();
                    break;
                case 2:
                    StateController.getInstance().functionC();
                    break;
            }
        }
    }
}
