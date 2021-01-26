package com.hefei.jetpack.sample_lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

import com.hefei.jetpack.support.entity.LocationBean;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/09
 *     desc  :
 * </pre>
 */
public class LocationManager implements DefaultLifecycleObserver {

    private static LocationManager sManager = new LocationManager();

    public static LocationManager getInstance() {
        return sManager;
    }

    private Timer mTimer;

    private ILocationChangedCallback mLocationChangedCallback;

    private List<LocationBean> mLocationBeans = new ArrayList<>();

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        Logger.e("onResume()");
        mTimer = new Timer();

        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                mLocationBeans.add(new LocationBean("福州台江区 " + System.currentTimeMillis() + " 号"));
                if (mLocationChangedCallback != null) {
                    mLocationChangedCallback.onLocationChanged(mLocationBeans);
                }

                onResume(owner);
            }
        }, 3000);
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        Logger.e("onPause()");
        mTimer.cancel();
        mTimer = null;

        mLocationBeans.clear();
    }

    public void setLocationChangedCallback(ILocationChangedCallback locationChangedCallback) {
        this.mLocationChangedCallback = locationChangedCallback;
    }

    public interface ILocationChangedCallback {
        void onLocationChanged(List<LocationBean> list);
    }
}
