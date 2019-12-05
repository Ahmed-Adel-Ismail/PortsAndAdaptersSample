package com.weather.app

import android.app.Application
import com.sample.cache.CacheAdapter
import com.sample.core.Core
import com.sample.database.DatabaseAdapter
import com.sample.logger.LoggerAdapter
import com.sample.preferences.PreferencesAdapter
import com.sample.resources.ResourcesAdapter
import com.sample.server.ServerAdapter

class WeatherApp : Application() {


    override fun onCreate() {
        super.onCreate()

        Core {
            initialize with DatabaseAdapter(applicationContext)
            and with PreferencesAdapter(applicationContext)
            and with CacheAdapter()
            and with ServerAdapter(applicationContext)
            and with ResourcesAdapter(applicationContext)
            and with LoggerAdapter(applicationContext)
        }
    }


}


