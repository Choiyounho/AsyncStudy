package com.soten.flowandrx.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LolChampion(
    @PrimaryKey
    val id: String,
    val name: String
)
