package com.weather.app

import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

class MainViewModel(val intents: Channel<Intent> = Channel(Channel.UNLIMITED)) : ViewModel() {

    init {
        viewModelScope.launch {
            intents.send(Intent(ACTION_INITIALIZE))
        }
    }

    override fun onCleared() {
        intents.cancel()
        super.onCleared()
    }
}



