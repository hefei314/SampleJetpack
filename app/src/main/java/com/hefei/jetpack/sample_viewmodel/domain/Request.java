package com.hefei.jetpack.sample_viewmodel.domain;

import androidx.lifecycle.LiveData;

import com.hefei.jetpack.support.entity.LocationBean;

import java.util.List;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/11
 *     desc  :
 * </pre>
 */
public class Request {

    public interface ILocationRequest {

        LiveData<List<LocationBean>> getLocationMutableLiveData();

        void requestLocationData();
    }

}
