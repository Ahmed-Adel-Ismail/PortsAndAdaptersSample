package com.weather.app

import android.content.Intent
import com.screen.favourites.FavouritesFragment
import com.screen.login.LoginFragment
import com.screen.splash.EXTRA_SPLASH_LOGGED_IN_USER

fun MainActivity.handleSplashIntent(intent1: Intent) {
    if (intent1.getBooleanExtra(EXTRA_SPLASH_LOGGED_IN_USER, false)) {
        replaceFragment(FavouritesFragment())
    } else {
        replaceFragment(LoginFragment())
    }
}