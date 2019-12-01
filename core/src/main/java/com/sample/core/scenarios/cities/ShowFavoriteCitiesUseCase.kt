package com.sample.core.scenarios.cities

@CitiesScenario
suspend fun showFavouriteCities(repository: CitiesRepository = CitiesRepositoryImplementer) =
    repository.loadFavouriteCities()
