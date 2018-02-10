package com.pumpkinpie65.androidexperiment.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pumpkinpie65.androidexperiment.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, RecyclerViewActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_activity);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new RecyclerViewAdapter(createDataSet());
        recyclerView.setAdapter(adapter);

    }

    public String[] createDataSet() {
        String[] dataSet = new String[100];
        for (int i = 0; i < dataSet.length; i++) {
            dataSet[i] = "The " + i + "th String";
        }
        return dataSet;
    }

}
