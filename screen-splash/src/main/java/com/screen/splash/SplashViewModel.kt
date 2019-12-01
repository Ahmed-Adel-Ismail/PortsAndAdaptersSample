package com.screen.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.core.scenarios.authentication.isLoggedIn
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

class SplashViewModel(
    val loggedInUser: Channel<Boolean> = Channel(Channel.UNLIMITED),
    val errorChannel: Channel<Throwable> = Channel(Channel.RENDEZVOUS)
) : ViewModel() {

    init {
        viewModelScope.launch(IO) {
            runCatching { isLoggedIn() }
                .onFailure { errorChannel.send(it) }
                .getOrDefault(false)
                .also { loggedInUser.send(it) }
        }
    }

}
