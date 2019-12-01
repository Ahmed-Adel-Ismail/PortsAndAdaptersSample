package com.sample.core

import com.sample.core.ports.*

internal lateinit var server: ServerPort
internal lateinit var database: DatabasePort
internal lateinit var preferences: PreferencesPort
internal lateinit var broadcasts: BroadcastsPort
internal lateinit var resources: ResourcesPort

@DslMarker
annotation class IntegrationDsl

/**
 * a function for initializing the Core module, it is considered as a Factory function but
 * for the entire module, not just a class
 */
@IntegrationDsl
@Suppress("FunctionName")
fun Core(block: CoreFactory.() -> Unit) {
    CoreFactory().apply(block)
}

class CoreFactory {

    @IntegrationDsl
    val with = this

    @IntegrationDsl
    infix fun server(port: ServerPort) {
        server = port
    }

    @IntegrationDsl
    infix fun database(port: DatabasePort) {
        database = port
    }

    @IntegrationDsl
    infix fun preferences(port: PreferencesPort) {
        preferences = port
    }

    @IntegrationDsl
    infix fun broadcasts(port: BroadcastsPort) {
        broadcasts = port
    }

    @IntegrationDsl
    infix fun resources(port: ResourcesPort) {
        resources = port
    }
}

