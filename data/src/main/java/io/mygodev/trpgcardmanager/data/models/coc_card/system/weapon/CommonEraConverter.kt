package io.mygodev.trpgcardmanager.data.models.coc_card.system.weapon

import androidx.room.TypeConverter

// 类型转换器
class CommonEraConverter {
    @TypeConverter
    fun fromSet(eras: Set<CommonEra>): String = eras.joinToString(",")
    
    @TypeConverter
    fun toSet(data: String): Set<CommonEra> = 
        data.split(",").map { CommonEra.valueOf(it) }.toSet()
}
