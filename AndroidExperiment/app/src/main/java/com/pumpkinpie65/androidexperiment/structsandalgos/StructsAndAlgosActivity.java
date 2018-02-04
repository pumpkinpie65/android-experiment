package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.pumpkinpie65.androidexperiment.R;

import java.util.Stack;

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
                .add(R.id.container_bottom, StackInputFragment.newInstance(), StackInputFragment.TAG)
                .commit();

        stackViewModel = ViewModelProviders.of(this).get(StackViewModel.class);

    }

    @Override
    protected void onStart() {
        super.onStart();

        stackViewModel.getStack().observe(this, new Observer<Stack<String>>() {
            @Override
            public void onChanged(@Nullable Stack<String> strings) {

                StringBuilder stringBuilder = new StringBuilder("Stack: ");

                while (!strings.empty()) {
                    stringBuilder.append(strings.pop() + " ");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(StructsAndAlgosActivity.this);

                builder.setMessage(stringBuilder.toString());
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                builder.create().show();

            }
        });

    }

}
