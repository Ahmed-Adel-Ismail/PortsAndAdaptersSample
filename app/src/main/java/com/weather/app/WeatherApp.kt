package com.weather.app

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.sample.core.Core
import com.sample.core.enities.Event
import com.sample.core.ports.BroadcastsPort
import com.sample.core.ports.ResourcesPort
import com.sample.database.DatabaseAdapter
import com.sample.preferences.PreferencesAdapter
import com.sample.server.ServerAdapter

class WeatherApp : Application() {


    override fun onCreate() {
        super.onCreate()

        Core {
            with server ServerAdapter(applicationContext)
            with database DatabaseAdapter(applicationContext)
            with preferences PreferencesAdapter(applicationContext)
            with broadcasts BroadcastsAdapter(applicationContext)
            with resources ResourcesAdapter(applicationContext)
        }
    }


}


class BroadcastsAdapter(private val context: Context) : BroadcastsPort {

    override fun sendBroadcast(event: Event) {
        context.sendBroadcast(event.toIntent())
    }

    private fun Event.toIntent(): Intent {
        val bundle = Bundle().apply { extras?.forEach { putSerializable(it.key, it.value) } }
        return Intent(key).putExtras(bundle)
    }
}


class ResourcesAdapter(val context: Context) : ResourcesPort {

    override fun stringResource(name: ResourcesPort.StringResources): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}