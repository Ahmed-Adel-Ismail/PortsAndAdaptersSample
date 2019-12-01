package com.sample.core.scenarios.authentication

import com.sample.core.enities.Password
import com.sample.core.enities.Username

@AuthenticationScenario
suspend fun register(
    username: Username,
    password: Password,
    inputValidation: suspend (String?) -> Boolean = { it.isValidCredential() },
    authenticationRepository: AuthenticationRepository = AuthenticationRepositoryImplementer
) {
    TODO()
}