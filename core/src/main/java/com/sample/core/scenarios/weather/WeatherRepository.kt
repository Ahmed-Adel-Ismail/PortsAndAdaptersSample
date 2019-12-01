package com.sample.core.scenarios.weather

import com.sample.core.enities.Forecast
import com.sample.core.server

@DslMarker
annotation class WeatherScenario

interface WeatherRepository {

    @WeatherScenario
    suspend fun requestThreeDaysForecast() : List<Forecast>

}


internal object WeatherRepositoryImplementer : WeatherRepository{
    override suspend fun requestThreeDaysForecast(): List<Forecast> =
        server.requestThreeDaysForecast()
}