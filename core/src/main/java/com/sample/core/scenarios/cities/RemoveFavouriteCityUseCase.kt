package com.sample.core.scenarios.cities

import com.sample.core.enities.City

@CitiesScenario
suspend fun removeFavouriteCity(
    city: City,
    repository: CitiesRepository = CitiesRepositoryImplementer
) = repository.removeFavouriteCity(city)
