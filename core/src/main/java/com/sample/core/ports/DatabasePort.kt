package com.sample.core.ports

import com.sample.core.enities.City
import com.sample.core.enities.CitySearchName

interface DatabasePort{

    fun queryCityByName(citySearchName: CitySearchName) : List<City>?
    fun queryAllFavouriteCities(): List<City>?
    fun insertFavouriteCity(city: City) : City
    fun deleteFavouriteCity(city: City) : City


}

