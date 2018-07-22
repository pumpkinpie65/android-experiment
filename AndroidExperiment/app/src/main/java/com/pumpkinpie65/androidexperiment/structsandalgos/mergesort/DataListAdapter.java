package com.pumpkinpie65.androidexperiment.structsandalgos.mergesort;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.pumpkinpie65.androidexperiment.shared.HorizontalListItemDataView;

import java.util.ArrayList;
import java.util.List;

public class DataListAdapter extends RecyclerView.Adapter<HorizontalListItemDataView.ViewHolder> {

    private @NonNull List data;

    public DataListAdapter() {
        data = new ArrayList();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @NonNull
    @Override
    public HorizontalListItemDataView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalListItemDataView.ViewHolder(new HorizontalListItemDataView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalListItemDataView.ViewHolder holder, int position) {
        holder.listItemDataView.update(data.get(position));
    }

    public void setData(@Nullable List data) {

        if (data == null) {
            this.data = new ArrayList();
        } else {
            this.data = data;
        }

    }

}
