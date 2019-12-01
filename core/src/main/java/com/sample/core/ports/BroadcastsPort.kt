package com.sample.core.ports

import com.sample.core.enities.Event

interface BroadcastsPort {

    fun sendBroadcast(event: Event)

}