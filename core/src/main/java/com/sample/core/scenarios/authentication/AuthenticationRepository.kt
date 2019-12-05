package com.sample.core.scenarios.authentication

import com.sample.core.enities.Password
import com.sample.core.enities.Token
import com.sample.core.enities.Username
import com.sample.core.ports.ResourcesPort
import com.sample.core.ports.StringResources
import com.sample.core.preferences
import com.sample.core.resources
import com.sample.core.server

@DslMarker
annotation class AuthenticationScenario

interface AuthenticationRepository {

    @AuthenticationScenario
    suspend fun requestLogin(username: Username, password: Password): Token

    @AuthenticationScenario
    suspend fun requestRegister(username: Username, password: Password): Token

    @AuthenticationScenario
    suspend fun requestForgotPassword(username: Username): Username

    @AuthenticationScenario
    suspend fun saveToken(token: Token): Token

    @AuthenticationScenario
    suspend fun loadToken(): Token?

    @AuthenticationScenario
    suspend fun loadInvalidCredentialsMessage(): String

}


private const val KEY_TOKEN = "com.sample.core.scenarios.authentication.KEY_TOKEN"

internal object AuthenticationRepositoryImplementer : AuthenticationRepository {

    override suspend fun requestLogin(username: Username, password: Password): Token =
        server.login(username, password)

    override suspend fun requestRegister(username: Username, password: Password): Token =
        server.register(username, password)

    override suspend fun requestForgotPassword(username: Username) =
        server.forgotPassword(username)

    override suspend fun saveToken(token: Token): Token =
        preferences.save(KEY_TOKEN, token)

    override suspend fun loadToken(): Token? =
        preferences.load(KEY_TOKEN)

    override suspend fun loadInvalidCredentialsMessage() =
        resources.localizedString(StringResources.InvalidCredentials)
}