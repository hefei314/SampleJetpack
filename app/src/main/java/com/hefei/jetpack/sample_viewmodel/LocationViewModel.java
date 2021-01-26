package com.hefei.jetpack.sample_viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.hefei.jetpack.sample_viewmodel.domain.LocationRequest;
import com.hefei.jetpack.sample_viewmodel.domain.Request;
import com.hefei.jetpack.support.entity.LocationBean;

import java.util.List;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/11
 *     desc  :
 * </pre>
 */
public class LocationViewModel extends ViewModel implements Request.ILocationRequest {

    private LocationRequest mLocationRequest = new LocationRequest();

    @Override
    public LiveData<List<LocationBean>> getLocationMutableLiveData() {
        return mLocationRequest.getLocationMutableLiveData();
    }

    @Override
    public void requestLocationData() {
        mLocationRequest.requestLocationData();
    }
}
