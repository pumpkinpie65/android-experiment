package com.pumpkinpie65.androidexperiment.structsandalgos.stack;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.pumpkinpie65.androidexperiment.shared.ListItemDataView;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Adapter for displaying Stack data in a RecyclerView
 */

public class StackAdapter<T> extends RecyclerView.Adapter<ListItemDataView.ViewHolder> {

    private ArrayList<T> stackItems = new ArrayList<>();

    public StackAdapter(Stack<T> stack) {

        //create copy to not lose data in original Stack
        stack = (Stack<T>) stack.clone();

        while (!stack.isEmpty()) {
            stackItems.add(stack.pop());
        }

    }

    @Override
    public int getItemCount() {
        return stackItems.size();
    }

    @Override
    public ListItemDataView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ListItemDataView.ViewHolder(new ListItemDataView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ListItemDataView.ViewHolder holder, int position) {
        holder.listItemDataView.update(stackItems.get(position));
    }

}
