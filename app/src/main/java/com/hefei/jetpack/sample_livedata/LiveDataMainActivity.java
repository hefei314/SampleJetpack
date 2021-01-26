package com.hefei.jetpack.sample_livedata;

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
 *     time  : 2020/09/10
 *     desc  :
 * </pre>
 */
public class LiveDataMainActivity extends BaseActivity {

    private LocationAdapter mLocationAdapter;
    private RecyclerView mRecyclerViewLocation;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, LiveDataMainActivity.class));
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_live_data_main;
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

        getLifecycle().addObserver(LiveDataLocationManager.getInstance());

        LiveDataLocationManager.getInstance().getLocationBeans().observe(this, list -> {
            if (mLocationAdapter.getData().size() > 0) {
                mLocationAdapter.notifyDataSetChanged();
            } else {
                mLocationAdapter.setNewInstance(list);
            }
        });
    }

    @Override
    protected void updateViews() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
