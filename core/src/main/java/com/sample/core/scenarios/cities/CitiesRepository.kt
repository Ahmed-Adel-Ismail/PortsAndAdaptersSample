package com.sample.core.scenarios.cities

import com.sample.core.database
import com.sample.core.enities.City
import com.sample.core.enities.CitySearchName
import com.sample.core.ports.ResourcesPort
import com.sample.core.resources

@DslMarker
annotation class CitiesScenario

interface CitiesRepository {

    @CitiesScenario
    suspend fun searchCityByName(citySearchName: CitySearchName): List<City>?

    @CitiesScenario
    suspend fun loadFavouriteCities(): List<City>?

    @CitiesScenario
    suspend fun addFavouriteCity(city: City): City

    @CitiesScenario
    suspend fun removeFavouriteCity(city: City): City

    @CitiesScenario
    suspend fun loadInvalidCitySearchNameMessage(): String

}

internal object CitiesRepositoryImplementer : CitiesRepository {

    override suspend fun searchCityByName(citySearchName: CitySearchName): List<City>? =
        database.queryCityByName(citySearchName)

    override suspend fun loadFavouriteCities(): List<City>? =
        database.queryAllFavouriteCities()

    override suspend fun addFavouriteCity(city: City) =
        database.insertFavouriteCity(city)

    override suspend fun removeFavouriteCity(city: City) =
        database.deleteFavouriteCity(city)

    override suspend fun loadInvalidCitySearchNameMessage() =
        resources.stringResource(ResourcesPort.StringResources.InvalidCitySearchName)
}