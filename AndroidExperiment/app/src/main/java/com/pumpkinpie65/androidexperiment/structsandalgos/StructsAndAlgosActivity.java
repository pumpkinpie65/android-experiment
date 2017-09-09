package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.pumpkinpie65.androidexperiment.R;

public class StructsAndAlgosActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    InputView inputView;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, StructsAndAlgosActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConstraintLayout.LayoutParams inputViewLayoutParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        inputViewLayoutParams.startToStart = ConstraintLayout.LayoutParams.PARENT_ID;
        inputViewLayoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        inputViewLayoutParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID;
        inputViewLayoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;

        constraintLayout = new ConstraintLayout(this);
        constraintLayout.setId(R.id.constraintlayout);
        inputView = new InputViewImpl(this);

        ((View) inputView).setLayoutParams(inputViewLayoutParams);

        constraintLayout.addView((View) inputView);

        Toast.makeText(this, "child count: " + constraintLayout.getChildCount(), Toast.LENGTH_LONG).show();

        setContentView(constraintLayout);

    }
}
