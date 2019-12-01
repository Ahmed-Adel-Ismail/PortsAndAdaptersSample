package com.sample.database

import android.content.Context
import com.sample.core.enities.City
import com.sample.core.enities.CitySearchName
import com.sample.core.ports.DatabasePort

class DatabaseAdapter(val context: Context) : DatabasePort{


    override fun queryCityByName(citySearchName: CitySearchName): List<City>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun queryAllFavouriteCities(): List<City>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun insertFavouriteCity(city: City): City {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteFavouriteCity(city: City): City {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}