package hjt.com.module_design_pattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tong.library.adapter.recyclerview.MultiItemTypeAdapter;
import com.tong.library.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import hjt.com.module_design_pattern.adpter.MainAdpter;
import hjt.com.module_design_pattern.single.SingleActivity;
import hjt.com.module_design_pattern.state.StateActivity;

@Route(path = "/design/main")
public class MainActivity extends BaseActivity {

    @BindView(R2.id.rlv)
    RecyclerView rlv;
    private List<String> dataList = new ArrayList<>();
    private MainAdpter mainAdpter;

    @Override
    protected int getLayoutResID() {
        return R.layout.design_activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        dataList.add("状态模式");
        dataList.add("单例模式");
        rlv.setLayoutManager(new LinearLayoutManager(getContext()));
        mainAdpter = new MainAdpter(getContext(), dataList);
        rlv.setAdapter(mainAdpter);
    }

    @Override
    protected void initEvent() {
        mainAdpter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getContext(), StateActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getContext(), SingleActivity.class));
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
