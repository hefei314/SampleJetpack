package com.hefei.jetpack.sample_lifecycle;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hefei.jetpack.R;
import com.hefei.jetpack.support.adapter.LocationAdapter;
import com.hefei.jetpack.support.base.BaseActivity;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/10
 *     desc  :
 * </pre>
 */
public class LifecycleMainActivity extends BaseActivity {

    private LocationAdapter mLocationAdapter;
    private RecyclerView mRecyclerViewLocation;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, LifecycleMainActivity.class));
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_lifecycle_main;
    }

    @Override
    protected boolean canBack() {
        return true;
    }

    @SuppressLint("CheckResult")
    @Override
    protected void initViews() {
        mRecyclerViewLocation = findViewById(R.id.recyclerView_location);

        mLocationAdapter = new LocationAdapter(null);
        mRecyclerViewLocation.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerViewLocation.setAdapter(mLocationAdapter);

        getLifecycle().addObserver(LocationManager.getInstance());

        LocationManager.getInstance().setLocationChangedCallback(list -> {
            Observable
                    .just(list)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(l -> {
                        if (mLocationAdapter.getData().size() > 0) {
                            mLocationAdapter.notifyDataSetChanged();
                        } else {
                            mLocationAdapter.setNewInstance(l);
                        }
                    });
        });
    }

    @Override
    protected void updateViews() {

    }
}
