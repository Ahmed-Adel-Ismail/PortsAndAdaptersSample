package com.sample.core.scenarios.cities

import com.sample.core.enities.CitySearchName

@CitiesScenario
suspend fun searchForCity(
    citySearchName: CitySearchName,
    isValidInput: suspend (String?) -> Boolean = { it.isValidCitySearchName() },
    repository: CitiesRepository = CitiesRepositoryImplementer
) {
    TODO()
}