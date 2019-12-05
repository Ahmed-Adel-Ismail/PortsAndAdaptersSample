package com.sample.database

import android.content.Context
import com.sample.core.IntegrationDsl
import com.sample.core.enities.City
import com.sample.core.enities.CitySearchName
import com.sample.core.ports.DatabasePort

class DatabaseAdapter @IntegrationDsl constructor(val context: Context) : DatabasePort{


    override suspend fun queryCityByName(citySearchName: CitySearchName): List<City>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun queryAllFavouriteCities(): List<City>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun insertFavouriteCity(city: City): City {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun deleteFavouriteCity(city: City): City {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}