package com.mmfsin.betweenmindsmp.domain.models

data class Question(
    val question: String,
    val pack: Int
)

enum class QuestionPhaseType {
    FIRST_OPINION,
    SECOND_OPINION,
    NEXT_ROUND,
    RESULTS
}