package com.hefei.jetpack.support.entity;

import com.blankj.utilcode.util.GsonUtils;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/11
 *     desc  :
 * </pre>
 */
public class LocationBean {

    private String locationName;

    public LocationBean(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return GsonUtils.toJson(this);
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
