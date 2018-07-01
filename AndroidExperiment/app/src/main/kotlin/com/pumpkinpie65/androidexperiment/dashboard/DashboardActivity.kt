package com.pumpkinpie65.androidexperiment.dashboard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.pumpkinpie65.androidexperiment.R
import com.pumpkinpie65.androidexperiment.modernfeed.ModernFeedActivity
import com.pumpkinpie65.androidexperiment.recyclerview.RecyclerViewActivity
import com.pumpkinpie65.androidexperiment.structsandalgos.StructsAndAlgosActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_activity)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        if (id == R.id.menu_recycleview) {
            startActivity(RecyclerViewActivity.newIntent(this))
            return true
        }

        if (id == R.id.menu_modern_feed) {
            startActivity(ModernFeedActivity.newIntent(this))
            return true
        }

        if (id == R.id.menu_structsandalgos) {
            startActivity(StructsAndAlgosActivity.newIntent(this))
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}