package com.pumpkinpie65.androidexperiment.structsandalgos;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.Stack;

/**
 * {@Link ViewModel} for manipulating Stack data
 */

public class StackViewModel extends ViewModel {

    private MutableLiveData<Stack<String>> stringStackLiveData;

    public LiveData<Stack<String>> getStack() {

        if (stringStackLiveData == null) {
            stringStackLiveData = new MutableLiveData<>();
            stringStackLiveData.setValue(new Stack<String>());
        }

        return stringStackLiveData;

    }

    public void push(String string) {

        Stack<String> stack = getStack().getValue();

        stack.push(string);

        stringStackLiveData.setValue(stack);

    }

}
