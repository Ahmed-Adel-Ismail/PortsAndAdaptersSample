package com.sample.core.ports

import com.sample.core.enities.Forecast
import com.sample.core.enities.Password
import com.sample.core.enities.Token
import com.sample.core.enities.Username

interface ServerPort {

    fun login(username: Username, password: Password): Token
    fun register(username: Username, password: Password): Token
    fun forgotPassword(username: Username): Username
    fun requestThreeDaysForecast(): List<Forecast>

}