package com.weather.app

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class IntentsReceiver(private val mainActivity: MainActivity) : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent) {
        mainActivity.onIntentReceived(intent)
    }
}

fun MainActivity.onIntentReceived(intent: Intent) {
    lifecycleScope.launch {
        viewModel.intents.send(intent)
    }
}