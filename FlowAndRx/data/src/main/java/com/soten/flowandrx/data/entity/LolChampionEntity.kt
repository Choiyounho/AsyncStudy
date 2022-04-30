package com.soten.flowandrx.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LolChampionEntity(
    @PrimaryKey
    val name: String,
    val image: String
)
