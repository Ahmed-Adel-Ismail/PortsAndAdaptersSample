package com.sample.core.scenarios.weather

@WeatherScenario
suspend fun requestThreeDaysForecast(
    repository: WeatherRepository = WeatherRepositoryImplementer
) = repository.requestThreeDaysForecast()