package com.sample.core.scenarios.cities

import com.sample.core.enities.City

@CitiesScenario
suspend fun addFavouriteCity(
    city: City,
    repository: CitiesRepository = CitiesRepositoryImplementer
) = repository.addFavouriteCity(city)
