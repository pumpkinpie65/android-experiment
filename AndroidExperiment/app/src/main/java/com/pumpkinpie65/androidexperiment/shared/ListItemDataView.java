package com.pumpkinpie65.androidexperiment.shared;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.ViewGroup;

/**
 * View for displaying individual data within a vertical list
 */

public class ListItemDataView<T> extends AppCompatTextView {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ListItemDataView listItemDataView;

        public ViewHolder(ListItemDataView listItemDataView) {
            super(listItemDataView);
            this.listItemDataView = listItemDataView;
        }

    }

    protected T dataItem;

    public ListItemDataView(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        setGravity(Gravity.CENTER_HORIZONTAL);
    }

    public void update(T dataItem) {
        this.dataItem = dataItem;
        setText(String.valueOf(dataItem));
    }

}
