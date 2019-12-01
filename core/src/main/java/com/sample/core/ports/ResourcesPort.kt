package com.sample.core.ports

interface ResourcesPort {

    fun stringResource(name: StringResources): String


    sealed class StringResources(val name: String) {
        object InvalidCredentials : StringResources("invalid_credentials")
        object InvalidCitySearchName : StringResources("invalid_city_search_name")
    }

}

