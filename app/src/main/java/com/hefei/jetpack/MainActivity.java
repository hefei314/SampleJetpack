package com.hefei.jetpack;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.hefei.jetpack.sample_hilt.HiltMainActivity;
import com.hefei.jetpack.sample_databinding.DataBindingMainActivity;
import com.hefei.jetpack.sample_lifecycle.LifecycleMainActivity;
import com.hefei.jetpack.sample_livedata.LiveDataMainActivity;
import com.hefei.jetpack.sample_navigation.NavigationMainActivity;
import com.hefei.jetpack.sample_paging.PagingMainActivity;
import com.hefei.jetpack.sample_room.RoomMainActivity;
import com.hefei.jetpack.sample_viewmodel.ViewModelMainActivity;
import com.hefei.jetpack.sample_workmanager.WorkManagerMainActivity;
import com.hefei.jetpack.support.base.BaseActivity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends BaseActivity implements OnItemClickListener {

    private MainAdapter mainAdapter;

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean canBack() {
        return false;
    }

    @Override
    protected void initViews() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        mainAdapter = new MainAdapter(getJumpData());
        mainAdapter.setOnItemClickListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(mainAdapter);
    }

    @Override
    protected void updateViews() {

    }

    @Override
    public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
        JumpBean item = mainAdapter.getItem(position);
        switch (item.getType()) {
            case 1:
                // Lifecycle
                LifecycleMainActivity.launch(this);
                break;
            case 2:
                // LiveData
                LiveDataMainActivity.launch(this);
                break;
            case 3:
                // ViewModel
                ViewModelMainActivity.launch(this);
                break;
            case 4:
                // DataBinding
                DataBindingMainActivity.launch(this);
                break;
            case 5:
                // Hilt
                HiltMainActivity.launch(this);
                break;
            case 6:
                // Room
                RoomMainActivity.launch(this);
                break;
            case 7:
                // Paging
                PagingMainActivity.launch(this);
                break;
            case 8:
                // Navigation
                NavigationMainActivity.launch(this);
                break;
            case 9:
                // WorkManager
                WorkManagerMainActivity.launch(this);
                break;
        }
    }

    private List<JumpBean> getJumpData() {
        return Arrays.asList(
                new JumpBean(1, "Lifecycle", ""),
                new JumpBean(2, "LiveData", ""),
                new JumpBean(3, "ViewModel", ""),
                new JumpBean(4, "DataBinding", ""),
                new JumpBean(5, "Hilt", ""),
                new JumpBean(6, "Room", ""),
                new JumpBean(7, "Paging", ""),
                new JumpBean(8, "Navigation", ""),
                new JumpBean(9, "WorkManager", "")
        );
    }

    public static class MainAdapter extends BaseQuickAdapter<JumpBean, BaseViewHolder> {

        public MainAdapter(@Nullable List<JumpBean> data) {
            super(R.layout.item_main, data);
        }

        @Override
        protected void convert(@NotNull BaseViewHolder baseViewHolder, JumpBean jumpBean) {
            baseViewHolder.setText(R.id.textTitle, jumpBean.getTitle());
        }
    }

    public static class JumpBean {
        private int type;
        private String title;
        private String imgUrl;

        public JumpBean(int type, String title, String imgUrl) {
            this.type = type;
            this.title = title;
            this.imgUrl = imgUrl;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }
    }
}