package com.pumpkinpie65.androidexperiment.structsandalgos.stack;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.ViewGroup;

/**
 * View for displaying individual data from the Stack
 */

public class StackDataView<T> extends AppCompatTextView {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public StackDataView stackDataView;

        public ViewHolder(StackDataView stackDataView) {
            super(stackDataView);
            this.stackDataView = stackDataView;
        }

    }

    private T dataItem;

    public StackDataView(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        setGravity(Gravity.CENTER_HORIZONTAL);
    }

    public void update(T dataItem) {
        this.dataItem = dataItem;
        setText(String.valueOf(dataItem));
    }

}
