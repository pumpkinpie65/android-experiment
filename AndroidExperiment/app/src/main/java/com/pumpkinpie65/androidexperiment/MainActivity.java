package com.pumpkinpie65.androidexperiment;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.pumpkinpie65.androidexperiment.constraintlayoutinrecyclerview.ConstraintLayoutInRecyclerViewActivity;
import com.pumpkinpie65.androidexperiment.modernfeed.ModernFeedActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.menu_recycleview) {
            Intent intent = new Intent(this, RecyclerViewActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.menu_modern_feed) {
            Intent intent = new Intent(this, ModernFeedActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.menu_constraintlayout_in_recyclerview) {
            startActivity(ConstraintLayoutInRecyclerViewActivity.newIntent(this));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
