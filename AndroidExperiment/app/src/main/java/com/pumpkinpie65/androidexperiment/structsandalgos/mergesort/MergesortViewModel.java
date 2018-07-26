package com.pumpkinpie65.androidexperiment.structsandalgos.mergesort;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergesortViewModel extends ViewModel {

    public static final String TAG = "MergesortViewModel";

    private MutableLiveData<List<Comparable>> liveData;

    public LiveData<List<Comparable>> getData() {

        if (liveData == null) {
            liveData = new MutableLiveData<>();
            liveData.setValue(new ArrayList());
        }

        return liveData;

    }

    public void addData(Comparable data) {
        List list = getData().getValue();
        list.add(data);
        liveData.setValue(list);
    }

    public void sortData() {

        if (liveData != null) {

            List<Comparable> list = liveData.getValue();

            recursiveMergesort(list.toArray(new Comparable[0]), 0, list.size());

        } else {
            Log.e(TAG, "liveData is null");
        }

    }

    private void recursiveMergesort(Comparable[] workspace, int lowerBound, int upperBound) {

        Log.d(TAG, "recursiveMergesort(" + workspace.length + ", " + lowerBound + ", " + upperBound);

        if (lowerBound == upperBound) {
            return;
        } else {

            int midpoint = (lowerBound + upperBound) / 2;

            //sort lower half of array
            recursiveMergesort(workspace, lowerBound, midpoint);

            //sort upper half of array
            recursiveMergesort(workspace, midpoint + 1, upperBound);

            Comparable[] sortedArray = merge(Arrays.copyOfRange(workspace, lowerBound, midpoint), Arrays.copyOfRange(workspace, midpoint, workspace.length));

            Log.d(TAG, "sortArray.length: " + sortedArray.length);

            liveData.setValue(Arrays.asList(sortedArray));

        }

    }

    private Comparable[] merge(Comparable[] firstArray, Comparable[] secondArray) {

        int firstArraySize = 0;
        int secondArraySize = 0;

        if (firstArray != null) {
            firstArraySize = firstArray.length;
        }

        if (secondArray != null) {
            secondArraySize = secondArray.length;
        }

        Log.d(TAG, "merge(firstArray.length: " + firstArray.length + " secondArray.length: " + secondArray.length);

        Comparable[] destinationArray = new Comparable[firstArraySize + secondArraySize];

        int firstArrayIndex = 0, secondArrayIndex = 0, destinationArrayIndex = 0;

        while (firstArrayIndex < firstArraySize && secondArrayIndex < secondArraySize) {

            if (firstArray[firstArrayIndex].compareTo(secondArray[secondArrayIndex]) < 0) {
                destinationArray[destinationArrayIndex++] = firstArray[firstArrayIndex++];
            } else {
                destinationArray[destinationArrayIndex++] = secondArray[secondArrayIndex++];
            }

        }

        //secondArray is empty but firstArray isn't
        while (firstArrayIndex < firstArraySize) {
            destinationArray[destinationArrayIndex++] = firstArray[firstArrayIndex++];
        }

        //firstArray is empty but secondArray isn't
        while (secondArrayIndex < secondArraySize) {
            destinationArray[destinationArrayIndex++] = secondArray[secondArrayIndex++];
        }

        return destinationArray;
    }

}
