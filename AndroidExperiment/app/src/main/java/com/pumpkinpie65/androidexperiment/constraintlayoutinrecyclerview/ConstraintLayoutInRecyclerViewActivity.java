package com.pumpkinpie65.androidexperiment.constraintlayoutinrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pumpkinpie65.androidexperiment.R;

public class ConstraintLayoutInRecyclerViewActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ConstraintLayoutInRecyclerViewActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraintlayout_in_recyclerview);
    }
}
