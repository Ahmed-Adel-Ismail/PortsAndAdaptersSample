package com.sample.core

import com.sample.core.ports.*

internal lateinit var cache: CachePort
internal lateinit var database: DatabasePort
internal lateinit var logger: LoggerPort
internal lateinit var preferences: PreferencesPort
internal lateinit var resources: ResourcesPort
internal lateinit var server: ServerPort

/**
 * an annotation that marks any code related to integration with the core module
 */
@DslMarker
annotation class IntegrationDsl

/**
 * a function for initializing the Core module, it is considered as a Factory function but
 * for the entire module, not just a class
 */
@IntegrationDsl
@Suppress("FunctionName")
fun Core(integrate: AdaptersFactoryProvider.() -> Unit) {
    integrate(AdaptersFactoryProvider())
}

class AdaptersFactoryProvider {
    @IntegrationDsl
    val initialize by lazy { AdaptersFactory() }

    @IntegrationDsl
    val and by lazy { initialize }
}

class AdaptersFactory {

    @IntegrationDsl
    infix fun with(port: Any) {
        when (port) {
            is ServerPort -> server = port
            is DatabasePort -> database = port
            is PreferencesPort -> preferences = port
            is ResourcesPort -> resources = port
            is CachePort -> cache = port
            is LoggerPort -> logger = port
        }
    }
}

