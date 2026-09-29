package com.mmfsin.betweenmindsmp.domain.interfaces

import com.mmfsin.betweenmindsmp.domain.models.GameType
import com.mmfsin.betweenmindsmp.domain.models.Pack
import com.mmfsin.betweenmindsmp.domain.models.Packs
import kotlinx.coroutines.flow.Flow

interface IPacksRepository {
    suspend fun getAllPacks(): Packs

    suspend fun getSelectedPackByType(gameType: GameType, packNumber: Int): Pack?
    suspend fun getPackById(packId: String): Pack?

    fun getSelectedQPackId(): Flow<Int>
    suspend fun updateSelectedQPackId(packNumber: Int)

    fun getSelectedRPackId(): Flow<Int>
    suspend fun updateSelectedRPackId(packNumber: Int)

    fun getSelectedRankingsPackId(): Flow<Int>
    suspend fun updateSelectedRankingsPackId(packNumber: Int)

    fun setFreePacks()

    suspend fun checkIfPurchasedPacks(): Pair<Boolean, String?>
    suspend fun updatedPacksPurchased()
}