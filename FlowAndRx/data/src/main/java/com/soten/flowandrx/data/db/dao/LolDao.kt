package com.soten.flowandrx.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.soten.flowandrx.data.db.entity.LolChampionInfo
import kotlinx.coroutines.flow.Flow

@Dao
interface LolDao {

    @Query("SELECT * FROM LolChampionInfo")
    fun getAllLolChampions(): Flow<List<LolChampionInfo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLolChampions(championInfo: LolChampionInfo)

}