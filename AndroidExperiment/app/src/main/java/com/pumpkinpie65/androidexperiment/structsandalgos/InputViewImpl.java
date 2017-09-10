package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.pumpkinpie65.androidexperiment.R;

/**
 * Created by pumpk on 9/8/2017.
 */

public class InputViewImpl extends ConstraintLayout implements InputView {

    EditText editText;
    ImageButton button;

    public InputViewImpl(Context context) {
        super(context);

        //ConstraintLayout.LayoutParams editTextLayoutParams = new ConstraintLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        ConstraintLayout.LayoutParams editTextLayoutParams = new ConstraintLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT);
        editTextLayoutParams.startToStart = LayoutParams.PARENT_ID;
        editTextLayoutParams.topToTop = LayoutParams.PARENT_ID;
        editTextLayoutParams.endToStart = R.id.button;
        editTextLayoutParams.bottomToBottom = LayoutParams.PARENT_ID;

        editText = new EditText(getContext());
        editText.setId(R.id.edittext);
        editText.setLayoutParams(editTextLayoutParams);


        ConstraintLayout.LayoutParams buttonLayoutParams = new ConstraintLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        //buttonLayoutParams.startToEnd = R.id.button;
        buttonLayoutParams.topToTop = LayoutParams.PARENT_ID;
        buttonLayoutParams.endToEnd = LayoutParams.PARENT_ID;
        buttonLayoutParams.bottomToBottom = LayoutParams.PARENT_ID;

        button = new ImageButton(getContext());
        button.setId(R.id.button);
        button.setLayoutParams(buttonLayoutParams);
        button.setImageResource(R.drawable.ic_send_black_24dp);

        addView(editText);
        addView(button);

    }

    @Override
    public void onUserInput(String input) {

    }

}
