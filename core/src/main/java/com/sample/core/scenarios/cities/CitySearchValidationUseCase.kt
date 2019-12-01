package com.sample.core.scenarios.cities

import com.sample.core.enities.ValidationException


private const val MINIMUM_LETTERS_COUNT = 3
private const val MAXIMUM_LETTERS_COUNT = 20

@CitiesScenario
@Throws(ValidationException::class)
internal suspend fun String?.isValidCitySearchName(
    minimumLettersCount: Int = MINIMUM_LETTERS_COUNT,
    maximumLettersCount: Int = MAXIMUM_LETTERS_COUNT,
    repository: CitiesRepository = CitiesRepositoryImplementer
): Boolean {
    TODO()
}