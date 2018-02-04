package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pumpkinpie65.androidexperiment.R;

public class StructsAndAlgosActivity extends AppCompatActivity {

    private StackViewModel stackViewModel;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, StructsAndAlgosActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.structs_and_algos_activity);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_main, StackDisplayFragment.newInstance(), StackDisplayFragment.TAG)
                .commit();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_bottom, StackInputFragment.newInstance(), StackInputFragment.TAG)
                .commit();

        stackViewModel = ViewModelProviders.of(this).get(StackViewModel.class);

    }

}
