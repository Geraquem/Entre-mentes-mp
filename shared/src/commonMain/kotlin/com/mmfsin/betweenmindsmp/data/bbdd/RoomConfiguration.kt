package com.mmfsin.betweenmindsmp.data.bbdd

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.mmfsin.betweenmindsmp.data.bbdd.daos.QuestionsDAO
import com.mmfsin.betweenmindsmp.data.models.QuestionDTO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

@Database(
    entities = [
        QuestionDTO::class,
        //        RangeDTO::class,
        //        PackDTO::class,
        //        RankingDTO::class
    ],
    version = 3,
    exportSchema = true
)

@ConstructedBy(AppDataBaseConstructor::class)
abstract class RoomConfiguration : RoomDatabase() {

    abstract fun questionsDAO(): QuestionsDAO
    //    abstract fun rangesDAO(): RangesDAO
    //    abstract fun rankingsDAO(): RankingsDAO
    //    abstract fun packsDAO(): PacksDAO
}

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object AppDataBaseConstructor : RoomDatabaseConstructor<RoomConfiguration> {
    override fun initialize(): RoomConfiguration
}

class CreateDatabase(private val builder: RoomDatabase.Builder<RoomConfiguration>) {
    fun getDatabase(): RoomConfiguration {
        return builder
            .fallbackToDestructiveMigration(dropAllTables = true)
            .setDriver(BundledSQLiteDriver())
            .setQueryCoroutineContext(Dispatchers.IO)
            .build()
    }
}