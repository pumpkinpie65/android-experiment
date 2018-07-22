package com.pumpkinpie65.androidexperiment.structsandalgos.mergesort;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.pumpkinpie65.androidexperiment.shared.HorizontalListItemDataView;

public class DataArrayAdapter extends RecyclerView.Adapter<HorizontalListItemDataView.ViewHolder> {

    @Override
    public int getItemCount() {
        return 0;
    }

    @NonNull
    @Override
    public HorizontalListItemDataView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalListItemDataView.ViewHolder holder, int position) {

    }

}
