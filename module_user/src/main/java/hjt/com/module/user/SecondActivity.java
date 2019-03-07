package hjt.com.module.user;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tong.library.base.BaseActivity;
import com.tong.library.service.LoginService;

import butterknife.BindView;

@Route(path = "/user/second")
public class SecondActivity extends BaseActivity {


    @Autowired()
    String key;
    @BindView(R2.id.webView)
    WebView webView;

    @Override
    protected int getLayoutResID() {
        return R.layout.user_activity_second;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);
    }

    @Override
    protected void initEvent() {

        LoginService.getInstance().setLogin(new TestILogin());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBlockNetworkImage(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        webView.loadUrl("https://mp.weixin.qq.com/s/UcxWxjD3rKngjXF2JSIJvA");

    }

}
