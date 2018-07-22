package com.pumpkinpie65.androidexperiment.structsandalgos.mergesort;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MergesortDisplayFragment extends Fragment {

    public static final String TAG = MergesortDisplayFragment.class.getSimpleName();

    RecyclerView recyclerView;

    public static MergesortDisplayFragment newInstance() {
        MergesortDisplayFragment fragment = new MergesortDisplayFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        recyclerView = new RecyclerView(getActivity());

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        return recyclerView;
    }

}
