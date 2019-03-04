package hjt.com.module_design_pattern.adpter;

import android.content.Context;

import com.tong.library.adapter.recyclerview.CommonAdapter;
import com.tong.library.adapter.recyclerview.base.ViewHolder;

import java.util.List;

import hjt.com.module_design_pattern.R;

/**
 * Created by hjt on 2019/3/4.
 */

public class MainAdpter extends CommonAdapter<String> {

    public MainAdpter(Context context, List<String> datas) {
        super(context, datas);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.design_rlv_main;
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {
        holder.setText(R.id.tv_name, s);
    }
}
