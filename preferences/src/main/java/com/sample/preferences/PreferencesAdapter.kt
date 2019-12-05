package com.sample.preferences

import android.content.Context
import com.sample.core.IntegrationDsl
import com.sample.core.ports.PreferencesPort

class PreferencesAdapter @IntegrationDsl constructor(val context: Context) : PreferencesPort{

    override suspend fun <T> save(key: String, value: T): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun <T> load(key: String): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun isSaved(key: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun remove(key: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}