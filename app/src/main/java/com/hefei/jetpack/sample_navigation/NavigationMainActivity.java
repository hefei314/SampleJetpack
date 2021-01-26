package com.hefei.jetpack.sample_navigation;

import android.content.Context;
import android.content.Intent;

import com.hefei.jetpack.R;
import com.hefei.jetpack.support.base.BaseActivity;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/12/30
 *     desc  :
 * </pre>
 */
public class NavigationMainActivity extends BaseActivity {

    public static void launch(Context context) {
        context.startActivity(new Intent(context, NavigationMainActivity.class));
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_navigation_main;
    }

    @Override
    protected boolean canBack() {
        return false;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void updateViews() {

    }
}
