package com.pumpkinpie65.androidexperiment.structsandalgos.mergesort;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MergesortViewModel extends ViewModel {

    private MutableLiveData<List> liveData;

    public LiveData<List> getData() {

        if (liveData == null) {
            liveData = new MutableLiveData<>();
            liveData.setValue(new ArrayList());
        }

        return liveData;

    }

    public void addData(Object data) {
        List list = getData().getValue();
        list.add(data);
        liveData.setValue(list);
    }

}
