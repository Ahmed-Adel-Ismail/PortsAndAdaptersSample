package com.sample.core.ports

interface ResourcesPort {

    suspend fun localizedString(stringResources: StringResources): String

}

sealed class StringResources(val name: String) {
    object InvalidCredentials : StringResources("invalid_credentials")
    object InvalidCitySearchName : StringResources("invalid_city_search_name")
}

