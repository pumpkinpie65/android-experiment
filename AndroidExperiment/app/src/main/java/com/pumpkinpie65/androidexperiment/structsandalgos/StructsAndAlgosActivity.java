package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.pumpkinpie65.androidexperiment.R;

public class StructsAndAlgosActivity extends AppCompatActivity {

    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;
    View button;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, StructsAndAlgosActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.structs_and_algos_activity);

        textInputLayout = findViewById(R.id.textinputlayout);
        textInputEditText = findViewById(R.id.edittext);
        button = findViewById(R.id.button);

    }
}
