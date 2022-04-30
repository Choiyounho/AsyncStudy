package com.soten.flowandrx.data.db.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.soten.flowandrx.data.db.entity.LolChampionInfo

class RoomConverter {

    @TypeConverter
    fun imageToString(image: LolChampionInfo.Image) = Gson().toJson(image)

    @TypeConverter
    fun stringToImage(imageString: String) = Gson().fromJson(imageString, LolChampionInfo.Image::class.java)

}