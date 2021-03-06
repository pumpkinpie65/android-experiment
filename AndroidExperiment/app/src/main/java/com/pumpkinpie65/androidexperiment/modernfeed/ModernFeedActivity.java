package com.pumpkinpie65.androidexperiment.modernfeed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.pumpkinpie65.androidexperiment.R;
import com.pumpkinpie65.androidexperiment.recyclerview.RecyclerViewActivity;
import com.pumpkinpie65.androidexperiment.recyclerview.RecyclerViewAdapter;

public class ModernFeedActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;

    private RecyclerViewAdapter recyclerViewAdapter;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ModernFeedActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modern_feed_activity);
        findAllViewsById();
        setSupportActionBar(toolbar);

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        recyclerViewAdapter = new RecyclerViewAdapter(createDataSet());
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void findAllViewsById() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
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
