package com.soten.flowandrx.data.network

import com.soten.flowandrx.data.db.entity.LolChampionInfo
import com.soten.flowandrx.data.network.response.ChampionResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface LolService {

    @GET("cdn/12.8.1/data/ko_KR/champion.json")
    suspend fun getAllChampions(): Response<ChampionResponse<LolChampionInfo>>

    companion object {

        fun create() = Retrofit.Builder()
            .baseUrl("https://ddragon.leagueoflegends.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LolService::class.java)

    }

}