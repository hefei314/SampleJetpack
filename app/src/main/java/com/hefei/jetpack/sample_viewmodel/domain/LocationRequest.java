package com.hefei.jetpack.sample_viewmodel.domain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.hefei.jetpack.sample_viewmodel.data.DataRepository;
import com.hefei.jetpack.support.entity.LocationBean;

import java.util.List;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/11
 *     desc  :
 * </pre>
 */
public class LocationRequest implements Request.ILocationRequest {

    private MutableLiveData<List<LocationBean>> mLocationMutableLiveData;

    @Override
    public LiveData<List<LocationBean>> getLocationMutableLiveData() {
        if (mLocationMutableLiveData == null) {
            mLocationMutableLiveData = new MutableLiveData<>();
        }
        return mLocationMutableLiveData;
    }

    @Override
    public void requestLocationData() {
        DataRepository.getInstance().requestLocationData(mLocationMutableLiveData);
    }

}
