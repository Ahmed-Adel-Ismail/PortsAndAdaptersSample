package com.sample.core.scenarios.authentication

import com.sample.core.enities.ValidationException

private const val MINIMUM_LETTERS_COUNT = 4
private const val MAXIMUM_LETTERS_COUNT = 12
private const val MINIMUM_CAPITAL_LETTERS_COUNT = 1
private const val MINIMUM_SPECIAL_CHARACTERS_COUNT = 1

@AuthenticationScenario
@Throws(ValidationException::class)
internal suspend fun String?.isValidCredential(
    minimumLettersCount: Int = MINIMUM_LETTERS_COUNT,
    maximumLettersCount: Int = MAXIMUM_LETTERS_COUNT,
    minimumCapitalLettersCount: Int = MINIMUM_CAPITAL_LETTERS_COUNT,
    maximumSpecialCharactersCount: Int = MINIMUM_SPECIAL_CHARACTERS_COUNT,
    repository: AuthenticationRepository = AuthenticationRepositoryImplementer
): Boolean {
    TODO()
}