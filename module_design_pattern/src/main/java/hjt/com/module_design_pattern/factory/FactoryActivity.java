package hjt.com.module_design_pattern.factory;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tong.library.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import hjt.com.module_design_pattern.R;
import hjt.com.module_design_pattern.R2;
import hjt.com.module_design_pattern.adpter.MainAdpter;

public class FactoryActivity extends BaseActivity {


    @BindView(R2.id.rlv)
    RecyclerView rlv;
    private List<String> dataList = new ArrayList<>();

    @Override
    protected int getLayoutResID() {
        return R.layout.design_activity_factory;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        rlv.setLayoutManager(new LinearLayoutManager(getContext()));
        MainAdpter mainAdpter = new MainAdpter(getContext(), dataList);
        rlv.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        rlv.setAdapter(mainAdpter);
        CarFactory carFactory = new CarFactory();
        Bike bike = carFactory.creatCar(Bike.class);
        Aodi aodi = carFactory.creatCar(Aodi.class);
        dataList.add(bike.describle());
        dataList.add(bike.whell());
        dataList.add(bike.weight());
        dataList.add(aodi.describle());
        dataList.add(aodi.whell());
        dataList.add(aodi.weight());
        mainAdpter.notifyDataSetChanged();
    }

    @Override
    protected void initEvent() {

    }

}
