package com.soten.flowandrx.data.network.response

data class ChampionResponse<T>(
    val data: Map<String, T>
)
