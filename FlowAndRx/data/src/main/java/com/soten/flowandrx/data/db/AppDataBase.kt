package com.soten.flowandrx.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.soten.flowandrx.data.db.converter.RoomConverter
import com.soten.flowandrx.data.db.dao.LolDao
import com.soten.flowandrx.data.db.entity.LolChampion
import com.soten.flowandrx.data.db.entity.LolChampionInfo

@Database(entities = [LolChampionInfo::class, LolChampion::class], version = 1, exportSchema = false)
@TypeConverters(RoomConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun lolDao(): LolDao

    companion object {

        @Volatile private var INSTANCE: AppDatabase? = null

        private const val DB_NAME = "mydb"

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DB_NAME
                ).build()

                INSTANCE = instance
                instance
            }
        }

    }
}