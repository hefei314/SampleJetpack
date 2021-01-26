package com.hefei.jetpack.sample_paging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hefei.jetpack.R;

public class PagingMainActivity extends AppCompatActivity {

    public static void launch(Context context) {
        context.startActivity(new Intent(context, PagingMainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paging_main);
    }
}