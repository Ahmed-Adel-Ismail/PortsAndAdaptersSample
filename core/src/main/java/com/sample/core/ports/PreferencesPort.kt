package com.sample.core.ports

interface PreferencesPort {

    suspend fun <T> save(key: String, value: T): T

    suspend fun <T> load(key: String): T?

    suspend fun isSaved(key: String): Boolean

    suspend fun remove(key: String): Boolean
}