package com.pumpkinpie65.androidexperiment.structsandalgos.mergesort;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MergesortDisplayFragment extends Fragment {

    public static final String TAG = MergesortDisplayFragment.class.getSimpleName();

    MergesortViewModel mergesortViewModel;

    RecyclerView recyclerView;

    DataListAdapter dataListAdapter;

    public static MergesortDisplayFragment newInstance() {
        MergesortDisplayFragment fragment = new MergesortDisplayFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mergesortViewModel = ViewModelProviders.of(getActivity()).get(MergesortViewModel.class);

        recyclerView = new RecyclerView(getActivity());

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        dataListAdapter = new DataListAdapter();

        recyclerView.setAdapter(dataListAdapter);

        mergesortViewModel.getData().observe(this, new Observer<List<Comparable>>() {
            @Override
            public void onChanged(@Nullable List<Comparable> list) {
                dataListAdapter.setData(list);
                dataListAdapter.notifyDataSetChanged();
            }
        });

        return recyclerView;
    }

}
