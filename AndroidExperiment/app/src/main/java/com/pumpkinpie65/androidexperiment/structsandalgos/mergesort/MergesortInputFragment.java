package com.pumpkinpie65.androidexperiment.structsandalgos.mergesort;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.pumpkinpie65.androidexperiment.R;

public class MergesortInputFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = MergesortInputFragment.class.getSimpleName();

    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;
    View addButton;
    View sortButton;

    public static MergesortInputFragment newInstance() {
        MergesortInputFragment fragment = new MergesortInputFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.structs_and_algos_mergesort_input_fragment, container, false);

        textInputLayout = view.findViewById(R.id.textinputlayout);
        textInputEditText = view.findViewById(R.id.edittext);
        addButton = view.findViewById(R.id.button_add);
        sortButton = view.findViewById(R.id.button_sort);

        addButton.setOnClickListener(this);
        sortButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        if (view == addButton) {
            Toast.makeText(getActivity(), "Add button clicked", Toast.LENGTH_SHORT).show();
        } else if (view == sortButton) {
            Toast.makeText(getActivity(), "Sort button clickced", Toast.LENGTH_SHORT).show();
        }

    }

}
