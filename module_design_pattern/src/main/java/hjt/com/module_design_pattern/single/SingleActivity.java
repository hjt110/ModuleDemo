package hjt.com.module_design_pattern.single;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.tong.library.adapter.recyclerview.MultiItemTypeAdapter;
import com.tong.library.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import hjt.com.module_design_pattern.R;
import hjt.com.module_design_pattern.R2;
import hjt.com.module_design_pattern.adpter.MainAdpter;

public class SingleActivity extends BaseActivity {

    @BindView(R2.id.rlv)
    RecyclerView rlv;
    private MainAdpter mainAdpter;
    private List<String> dataList = new ArrayList<>();

    @Override
    protected int getLayoutResID() {
        return R.layout.design_activity_single;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        dataList.add(Singleton.getInstance().hashCode() + "");
        rlv.setLayoutManager(new LinearLayoutManager(getContext()));
        mainAdpter = new MainAdpter(getContext(), dataList);
        rlv.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        rlv.setAdapter(mainAdpter);
    }

    @Override
    protected void initEvent() {
        mainAdpter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                //通过刷新新的Singleton对象的hashCode值证明新的对象是否为同一个
                dataList.add(Singleton.getInstance().hashCode() + "");
                mainAdpter.notifyDataSetChanged();
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });
    }
}
