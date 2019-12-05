package com.sample.cache

import com.sample.core.IntegrationDsl
import com.sample.core.ports.CachePort

class CacheAdapter @IntegrationDsl constructor() : CachePort{

    override fun <T> save(key: String, value: T): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> load(key: String): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isSaved(key: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(key: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun observeOn(key: String, vararg states: CachePort.ObserveOnStates) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}