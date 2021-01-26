package com.hefei.jetpack.sample_viewmodel.data;

import androidx.lifecycle.MutableLiveData;

import com.hefei.jetpack.support.entity.LocationBean;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    private static DataRepository sRepository = new DataRepository();

    public static DataRepository getInstance() {
        return sRepository;
    }

    private DataRepository() {
    }

    public void requestLocationData(MutableLiveData<List<LocationBean>> liveData) {
        List<LocationBean> list = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list.add(new LocationBean(String.format("福州台江区%d号", i)));
        }

        liveData.setValue(list);
    }
}
