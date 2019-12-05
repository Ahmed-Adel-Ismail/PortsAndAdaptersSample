package com.sample.core.ports

interface LoggerPort {

    fun log(tag: String, message: Any?)

    fun warn(tag: String, message: Any?)

    fun error(tag: String, message: Any?)

    fun error(tag: String, throwable: Throwable?)

    fun error(throwable: Throwable?)

}