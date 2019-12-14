package com.weather.app

import android.content.Intent
import android.content.IntentFilter
import com.screen.splash.ACTION_SPLASH_FINISHED
import com.screen.splash.SplashFragment

const val ACTION_INITIALIZE = "application/com.weather.app.ACTION_INITIALIZE"

fun intentsFilter() = IntentFilter(
    ACTION_INITIALIZE,
    ACTION_SPLASH_FINISHED
)

fun MainActivity.onHandleIntent(intent: Intent) = with(intent) {
    when (action) {
        ACTION_INITIALIZE -> addFragment(SplashFragment())
        ACTION_SPLASH_FINISHED -> handleSplashIntent(this)
    }
}



