package com.pumpkinpie65.androidexperiment.modernfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pumpkinpie65.androidexperiment.R;
import com.pumpkinpie65.androidexperiment.RecyclerViewAdapter;

public class ModernFeedActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern_feed);
        findAllViewsById();

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        recyclerViewAdapter = new RecyclerViewAdapter(createDataSet());
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void findAllViewsById() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }

    public String[] createDataSet() {
        String[] dataSet = new String[100];
        for (int i = 0; i < dataSet.length; i++) {
            dataSet[i] = "The " + i + "th String";
        }
        return dataSet;
    }

}
