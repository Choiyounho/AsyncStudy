package com.soten.flowandrx.di

import android.content.Context
import com.soten.flowandrx.data.db.AppDatabase
import com.soten.flowandrx.data.db.AppDatabase.Companion.getInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideRoom(@ApplicationContext context: Context) = getInstance(context)

    @Provides
    fun provideLolDao(appDatabase: AppDatabase) = appDatabase.lolDao()

}