package com.sample.core.enities

import java.io.Serializable

inline class Username(
    val value: String? = null
) : Serializable

inline class Password(
    val value: String? = null
) : Serializable


inline class Token(
    val value: String? = null
) : Serializable

data class Event(
    val key: String,
    val extras: Map<String, Serializable>? = null
) : Serializable

data class City(
    val id: CityId,
    val name: CityName
) : Serializable

inline class CityId(
    val value: Long
) : Serializable

inline class CityName(
    val value: String
) : Serializable

inline class CitySearchName(
    val value: String
) : Serializable

data class Forecast(
    val dateText: String? = null,
    val cloudiness: String? = null,
    val humidity: String? = null,
    val temperature: String? = null,
    val weather: String? = null,
    val windSpeed: String? = null
) : Serializable