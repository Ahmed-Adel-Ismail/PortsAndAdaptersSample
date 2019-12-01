package com.sample.preferences

import android.content.Context
import com.sample.core.ports.PreferencesPort

class PreferencesAdapter(val context: Context) : PreferencesPort{


    override fun <T> save(key: String, value: T): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> load(key: String): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isSaved(key: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}