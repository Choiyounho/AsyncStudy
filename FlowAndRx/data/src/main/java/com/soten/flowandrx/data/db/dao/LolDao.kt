package com.soten.flowandrx.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.soten.flowandrx.data.db.entity.LolChampionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LolDao {

    @Query("SELECT * FROM LolChampionEntity")
    fun getAllLolChampions(): Flow<List<LolChampionEntity>>

}