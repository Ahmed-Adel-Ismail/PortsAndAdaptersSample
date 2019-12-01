package com.sample.core.ports

interface PreferencesPort {

    fun <T> save(key: String, value: T): T

    fun <T> load(key: String): T?

    fun isSaved(key: String): Boolean
}