package com.hefei.jetpack.sample_livedata;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.hefei.jetpack.support.entity.LocationBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/10
 *     desc  :
 * </pre>
 */
public class LiveDataLocationManager implements DefaultLifecycleObserver {

    private static LiveDataLocationManager sManager = new LiveDataLocationManager();

    public static LiveDataLocationManager getInstance() {
        return sManager;
    }

    private Timer mTimer;

    private List<LocationBean> mLocationList = new ArrayList<>();

    private MutableLiveData<List<LocationBean>> mLocationBeans = new MutableLiveData<>();

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        mTimer = new Timer();

        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                mLocationList.add(new LocationBean("福州台江区 " + System.currentTimeMillis() + " 号"));

                mLocationBeans.postValue(mLocationList);

                onResume(owner);
            }
        }, 2000);
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        mTimer.cancel();
        mTimer = null;

        mLocationList.clear();
    }

    public LiveData<List<LocationBean>> getLocationBeans() {
        return mLocationBeans;
    }
}
