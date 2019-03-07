package hjt.com.module.main;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tong.library.adapter.recyclerview.MultiItemTypeAdapter;
import com.tong.library.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import hjt.com.componentbase.LoginService;
import hjt.com.module.main.adpter.MainAdpter;

@Route(path = "/main/main")
public class MainActivity extends BaseActivity {


    @BindView(R2.id.rlv)
    RecyclerView rlv;
    private List<String> dateList = new ArrayList<>();
    private MainAdpter mainAdpter;

    @Override
    protected int getLayoutResID() {
        return R.layout.main_activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        dateList.add("module_design_pattern");
        dateList.add("module_user");
        dateList.add("module_test");
        dateList.add("isLogin");
        rlv.setLayoutManager(new LinearLayoutManager(getContext()));
        mainAdpter = new MainAdpter(getContext(), dateList);
        rlv.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        rlv.setAdapter(mainAdpter);
    }

    @Override
    protected void initEvent() {
        mainAdpter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                switch (position) {
                    case 0:
                        ARouter.getInstance().build("/design/main").navigation();
                        break;
                    case 1:
                        ARouter.getInstance().build("/user/second").navigation();
                        break;
                    case 2:
                        ARouter.getInstance().build("/test/test").navigation();
                        break;
                    case 3:
                        show(LoginService.getInstance().isLogin()+"");
                        break;
                }
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });
    }

}
