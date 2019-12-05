package com.sample.logger

import android.content.Context
import com.sample.core.IntegrationDsl
import com.sample.core.ports.LoggerPort

class LoggerAdapter @IntegrationDsl constructor(val context: Context) : LoggerPort{

    override fun log(tag: String, message: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun warn(tag: String, message: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun error(tag: String, message: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun error(tag: String, throwable: Throwable?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun error(throwable: Throwable?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}