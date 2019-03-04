package hjt.com.module_design_pattern.state;

/**
 * Created by hjt on 2019/3/4.
 */

public class StateController {

    private static StateController mStateController;

    private IState mIState = new GGState();

    private StateController() {
    }

    public static StateController getInstance() {
        if (mStateController == null) {
            mStateController = new StateController();
        }
        return mStateController;
    }

    public void setState(IState iState) {
        mIState = iState;
    }

    public void functionA() {
        mIState.functionA();
    }

    public void functionB() {
        mIState.functionB();
    }

    public void functionC() {
        mIState.functionC();
        ;
    }


}
