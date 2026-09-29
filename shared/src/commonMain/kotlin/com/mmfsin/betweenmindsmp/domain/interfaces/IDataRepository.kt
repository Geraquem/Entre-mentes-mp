package com.mmfsin.betweenmindsmp.domain.interfaces

import com.mmfsin.betweenmindsmp.domain.models.Ranking
import com.mmfsin.betweenmindsmp.domain.models.Question
import com.mmfsin.betweenmindsmp.domain.models.Range

interface IDataRepository {
    suspend fun checkVersion()

    suspend fun getQuestions(): List<Question>
    suspend fun getRanges(): List<Range>
    suspend fun getRankings(): List<Ranking>
}