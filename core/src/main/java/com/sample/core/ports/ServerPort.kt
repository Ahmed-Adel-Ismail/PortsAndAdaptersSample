package com.sample.core.ports

import com.sample.core.enities.Forecast
import com.sample.core.enities.Password
import com.sample.core.enities.Token
import com.sample.core.enities.Username

interface ServerPort {

    suspend fun login(username: Username, password: Password): Token
    suspend fun register(username: Username, password: Password): Token
    suspend fun forgotPassword(username: Username): Username
    suspend fun requestThreeDaysForecast(): List<Forecast>

}