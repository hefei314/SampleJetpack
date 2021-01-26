package com.hefei.jetpack.support.base;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/10
 *     desc  :
 * </pre>
 */
public abstract class BaseActivity extends AppCompatActivity {

    private ViewModelProvider mActivityProvider;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(attachLayoutRes());
        initToolbar(canBack());
        initViews();
        updateViews();
    }

    protected void initToolbar(boolean homeAsUpEnabled) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(homeAsUpEnabled);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    protected <T extends ViewModel> T getActivityViewModel(@NonNull Class<T> modelClass) {
        if (mActivityProvider == null) {
            mActivityProvider = new ViewModelProvider(this);
        }
        return mActivityProvider.get(modelClass);
    }

    @LayoutRes
    protected abstract int attachLayoutRes();

    protected abstract boolean canBack();

    protected abstract void initViews();

    protected abstract void updateViews();
}
