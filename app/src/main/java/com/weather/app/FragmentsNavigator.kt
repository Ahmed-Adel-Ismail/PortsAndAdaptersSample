package com.weather.app

import androidx.fragment.app.Fragment
import com.sample.app.R

fun MainActivity.addFragment(newFragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .add(R.id.mainFragmentContainer, newFragment)
        .addToBackStack(newFragment.javaClass.name)
        .commit()
}

fun MainActivity.replaceFragment(newFragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(R.id.mainFragmentContainer, newFragment, newFragment.javaClass.name)
        .addToBackStack(newFragment.javaClass.name)
        .commit()
}