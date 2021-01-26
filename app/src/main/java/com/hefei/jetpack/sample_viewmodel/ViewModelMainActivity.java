package com.hefei.jetpack.sample_viewmodel;

import android.content.Context;
import android.content.Intent;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hefei.jetpack.R;
import com.hefei.jetpack.support.adapter.LocationAdapter;
import com.hefei.jetpack.support.base.BaseActivity;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/11
 *     desc  :
 * </pre>
 */
public class ViewModelMainActivity extends BaseActivity {

    private LocationViewModel mLocationViewModel;

    private LocationAdapter mLocationAdapter;
    private RecyclerView mRecyclerViewLocation;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, ViewModelMainActivity.class));
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_view_model_main;
    }

    @Override
    protected boolean canBack() {
        return true;
    }

    @Override
    protected void initViews() {
        mRecyclerViewLocation = findViewById(R.id.recyclerView_location);

        mLocationAdapter = new LocationAdapter(null);
        mRecyclerViewLocation.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerViewLocation.setAdapter(mLocationAdapter);

        mLocationViewModel = getActivityViewModel(LocationViewModel.class);

        mLocationViewModel.getLocationMutableLiveData().observe(this, list -> {
            if (mLocationAdapter.getData().size() > 0) {
                mLocationAdapter.notifyDataSetChanged();
            } else {
                mLocationAdapter.setNewInstance(list);
            }
        });

        mLocationViewModel.requestLocationData();
    }

    @Override
    protected void updateViews() {

    }
}
