package com.liuh.learn.quickindex.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.liuh.learn.quickindex.R;
import com.liuh.learn.quickindex.model.ATestGoodMan;

import java.util.List;

/**
 * Created by huan on 2018/3/12.
 */

public class CityListAdapter extends BaseQuickAdapter<ATestGoodMan, BaseViewHolder> {

    public CityListAdapter(@Nullable List<ATestGoodMan> data) {
        super(R.layout.item_city, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ATestGoodMan item) {

    }
}
