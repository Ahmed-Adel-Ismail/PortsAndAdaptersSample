package com.sample.core.scenarios.authentication

import com.sample.core.enities.Username

@AuthenticationScenario
suspend fun forgotPassword(
    username: Username,
    isValidInput: suspend (String?) -> Boolean = { it.isValidCredential() },
    authenticationRepository: AuthenticationRepository = AuthenticationRepositoryImplementer
) {
    TODO()
}