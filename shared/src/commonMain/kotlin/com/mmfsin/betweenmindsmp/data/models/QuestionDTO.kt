package com.mmfsin.betweenmindsmp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mmfsin.betweenmindsmp.utils.TABLE_QUESTIONS
import kotlin.uuid.Uuid

@Entity(tableName = TABLE_QUESTIONS)
data class QuestionDTO(
    @PrimaryKey()
    var id: String = Uuid.random().toString(),
    var question: String = "",
    var pack: Int = 0
)
