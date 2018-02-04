package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.pumpkinpie65.androidexperiment.R;
import com.pumpkinpie65.androidexperiment.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.Stack;

/**
 * {@link Fragment} to display the data in a stack
 */

public class StackDisplayFragment extends Fragment {

    public static final String TAG = StackDisplayFragment.class.getSimpleName();

    RecyclerView recyclerView;

    private StackViewModel stackViewModel;

    public static StackDisplayFragment newInstance() {
        StackDisplayFragment fragment = new StackDisplayFragment();
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

        recyclerView = (RecyclerView) inflater.inflate(R.layout.layout_recyclerview, container, false);

        return recyclerView;
    }

    @Override
    public void onStart() {
        super.onStart();

        stackViewModel.getStack().observe(this, new Observer<Stack<String>>() {
            @Override
            public void onChanged(@Nullable Stack<String> strings) {

                Stack<String> otherStack = new Stack<>();
                ArrayList<String> items = new ArrayList<>();

                while (!strings.isEmpty()) {
                    otherStack.push(strings.pop());
                }

                while (!otherStack.isEmpty()) {

                    String item = otherStack.pop();

                    items.add(item);
                    strings.push(item);

                }

                Toast.makeText(getActivity(), "trying to show " + items.toArray(new String[items.size()]).length + " strings", Toast.LENGTH_LONG).show();

                recyclerView.setAdapter(new RecyclerViewAdapter(items.toArray(new String[items.size()])));

            }
        });

    }
}
