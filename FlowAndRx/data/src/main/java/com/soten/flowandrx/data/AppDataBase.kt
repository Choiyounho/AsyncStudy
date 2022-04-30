package com.soten.flowandrx.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.soten.flowandrx.data.entity.LolChampionEntity

@Database(entities = [LolChampionEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

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