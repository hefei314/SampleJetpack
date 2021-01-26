package com.hefei.jetpack;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/09
 *     desc  :
 * </pre>
 */
public class ThisApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }
}
