package com.weather.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.lifecycleScope
import com.sample.app.R
import kotlinx.coroutines.launch

/**
 * this class is responsible for App navigation
 */
class MainActivity : AppCompatActivity() {

    val intentsReceiver by lazy { IntentsReceiver(this) }
    val viewModel by lazy { ViewModelProviders.of(this).get(MainViewModel::class.java) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handleIntents()
    }


    override fun onDestroy() {
        unHandleIntents()
        super.onDestroy()
    }
}


fun MainActivity.handleIntents() {
    registerReceiver(intentsReceiver, intentsFilter())
    lifecycleScope.launch {
        for (intent in viewModel.intents) {
            onHandleIntent(intent)
        }
    }
}


fun MainActivity.unHandleIntents() {
    unregisterReceiver(intentsReceiver)
}




