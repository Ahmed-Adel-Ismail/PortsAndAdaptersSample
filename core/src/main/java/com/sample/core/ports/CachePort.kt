package com.sample.core.ports

interface CachePort {

    fun <T> save(key: String, value: T): T

    fun <T> load(key: String): T?

    fun isSaved(key: String): Boolean

    fun remove(key: String): Boolean

    fun observeOn(key: String, vararg states: ObserveOnStates = arrayOf(ObserveOnStates.SAVE))

    enum class ObserveOnStates {
        SAVE, REMOVE, LOAD
    }

}