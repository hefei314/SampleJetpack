package com.hefei.jetpack.sample_hilt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hefei.jetpack.R;

public class HiltMainActivity extends AppCompatActivity {

    public static void launch(Context context) {
        context.startActivity(new Intent(context, HiltMainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilt_main);
    }
}