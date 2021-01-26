package com.hefei.jetpack.support.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.hefei.jetpack.R;
import com.hefei.jetpack.support.entity.LocationBean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/11
 *     desc  :
 * </pre>
 */
public class LocationAdapter extends BaseQuickAdapter<LocationBean, BaseViewHolder> {

    public LocationAdapter(@Nullable List<LocationBean> data) {
        super(R.layout.item_location, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, LocationBean locationBean) {
        baseViewHolder.setText(R.id.text, locationBean.getLocationName());
    }
}
