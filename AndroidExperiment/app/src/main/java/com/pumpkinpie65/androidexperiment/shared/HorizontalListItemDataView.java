package com.pumpkinpie65.androidexperiment.shared;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;

/**
 * View for displaying individual data within a horizontal list
 */

public class HorizontalListItemDataView<T> extends ListItemDataView<T> {


    public HorizontalListItemDataView(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setGravity(Gravity.CENTER_VERTICAL);
    }

}
