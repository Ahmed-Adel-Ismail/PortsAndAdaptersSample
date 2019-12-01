package com.sample.core.scenarios.authentication

@AuthenticationScenario
suspend fun isLoggedIn(
    repository: AuthenticationRepository = AuthenticationRepositoryImplementer
) = repository.loadToken() != null