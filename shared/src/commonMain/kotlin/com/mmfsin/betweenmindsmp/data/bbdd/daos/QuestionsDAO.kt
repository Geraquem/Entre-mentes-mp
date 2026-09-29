package com.mmfsin.betweenmindsmp.data.bbdd.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mmfsin.betweenmindsmp.data.models.QuestionDTO

@Dao
interface QuestionsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestions(questions: List<QuestionDTO>)

    @Query("SELECT * FROM table_questions")
    suspend fun getQuestions(): List<QuestionDTO>
}