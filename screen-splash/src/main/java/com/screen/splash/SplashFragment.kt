package com.screen.splash

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch


const val ACTION_SPLASH_FINISHED = "application/com.screen.splash.ACTION_SPLASH_FINISHED"
const val EXTRA_SPLASH_LOGGED_IN_USER = "application/com.screen.splash.EXTRA_SPLASH_LOGGED_IN_USER"


class SplashFragment : Fragment() {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SplashViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        lifecycleScope.launch {
            for (error in viewModel.errorChannel) {
                Toast.makeText(context, error.message ?: error.toString(), Toast.LENGTH_LONG).show()
            }
        }

        lifecycleScope.launch {
            for (isLoggedIn in viewModel.loggedInUser) {
                Intent(ACTION_SPLASH_FINISHED)
                    .putExtra(EXTRA_SPLASH_LOGGED_IN_USER, isLoggedIn)
                    .let { activity?.sendBroadcast(it) }
            }
        }

    }
}
