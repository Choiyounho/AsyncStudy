package com.soten.flowandrx.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LolChampionInfo(
    @PrimaryKey
    val name: String,
    val image: Image
) {

    data class Image(
        val full: String
    )

}
