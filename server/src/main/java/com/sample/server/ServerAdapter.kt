package com.sample.server

import android.content.Context
import com.sample.core.enities.Forecast
import com.sample.core.enities.Password
import com.sample.core.enities.Token
import com.sample.core.enities.Username
import com.sample.core.ports.ServerPort

class ServerAdapter(private val context: Context) : ServerPort{

    override fun login(username: Username, password: Password): Token {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun register(username: Username, password: Password): Token {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun forgotPassword(username: Username): Username {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun requestThreeDaysForecast(): List<Forecast> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

