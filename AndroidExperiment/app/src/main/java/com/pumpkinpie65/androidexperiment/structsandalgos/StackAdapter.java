package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Adapter for displaying Stack data in a RecyclerView
 */

public class StackAdapter<T> extends RecyclerView.Adapter<StackDataView.ViewHolder> {

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
    public StackDataView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new StackDataView.ViewHolder(new StackDataView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(StackDataView.ViewHolder holder, int position) {
        holder.stackDataView.update(stackItems.get(position));
    }

}
