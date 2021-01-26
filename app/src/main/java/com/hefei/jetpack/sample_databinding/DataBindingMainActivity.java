package com.hefei.jetpack.sample_databinding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hefei.jetpack.R;

public class DataBindingMainActivity extends AppCompatActivity {

    public static void launch(Context context) {
        context.startActivity(new Intent(context, DataBindingMainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_binding_main);
    }
}