package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pumpkinpie65.androidexperiment.R;

/**
 * {@link Fragment} to handle user input for Stacks
 */

public class StackInputFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = StackInputFragment.class.getSimpleName();

    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;
    View button;

    private StackViewModel stackViewModel;

    public static StackInputFragment newInstance() {
        StackInputFragment fragment = new StackInputFragment();
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        stackViewModel = ViewModelProviders.of(getActivity()).get(StackViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.structs_and_algos_stack_input_fragment, container, false);

        textInputLayout = view.findViewById(R.id.textinputlayout);
        textInputEditText = view.findViewById(R.id.edittext);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        stackViewModel.push(textInputEditText.getText().toString());
    }

}
