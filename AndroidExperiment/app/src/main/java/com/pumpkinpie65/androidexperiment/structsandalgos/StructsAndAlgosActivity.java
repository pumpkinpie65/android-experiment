package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.pumpkinpie65.androidexperiment.R;
import com.pumpkinpie65.androidexperiment.structsandalgos.stack.StackDisplayFragment;
import com.pumpkinpie65.androidexperiment.structsandalgos.stack.StackInputFragment;

public class StructsAndAlgosActivity extends AppCompatActivity {

    public static final int TYPE_STACK = 1;

    private int type = TYPE_STACK;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, StructsAndAlgosActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.structs_and_algos_activity);

        switch (type) {
            case (TYPE_STACK):
            default:

                addFragmentToMainContainer(StackDisplayFragment.newInstance(), StackDisplayFragment.TAG);
                addFragmentToBottomContainer(StackInputFragment.newInstance(), StackInputFragment.TAG);

                break;
        }

    }

    private void addFragmentToMainContainer(Fragment fragment, String tag) {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_main, fragment, tag)
                .commit();
    }

    private void addFragmentToBottomContainer(Fragment fragment, String tag) {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_bottom, fragment, tag)
                .commit();
    }

}
