package com.soten.flowandrx.data.db.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.soten.flowandrx.data.db.entity.LolChampionEntity

class RoomConverter {

    @TypeConverter
    fun imageToString(image: LolChampionEntity.Image) = Gson().toJson(image)

    @TypeConverter
    fun stringToImage(imageString: String) = Gson().fromJson(imageString, LolChampionEntity.Image::class.java)

}