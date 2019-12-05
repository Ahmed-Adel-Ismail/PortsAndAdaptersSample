package com.sample.core.ports

import com.sample.core.enities.City
import com.sample.core.enities.CitySearchName

interface DatabasePort{

    suspend fun queryCityByName(citySearchName: CitySearchName) : List<City>?
    suspend fun queryAllFavouriteCities(): List<City>?
    suspend fun insertFavouriteCity(city: City) : City
    suspend fun deleteFavouriteCity(city: City) : City


}

