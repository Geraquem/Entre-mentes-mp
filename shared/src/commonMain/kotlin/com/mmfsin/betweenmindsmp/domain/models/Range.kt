package com.mmfsin.betweenmindsmp.domain.models

data class Range(
    val leftRange: String,
    val rightRange: String,
    val pack: Int,
)

enum class RangePhaseType {
    SHOW_BULLSEYE,
    MOVE_ARROW,
    NEXT_ROUND,
    RESULTS
}