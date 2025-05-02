package io.mygodev.trpgcardmanager.data.models.coc_card.system.weapon

import androidx.room.TypeConverter

class WeaponCategoryConverter {
    @TypeConverter
    fun fromCategory(category: WeaponCategory): String = category.name
    
    @TypeConverter
    fun toCategory(name: String): WeaponCategory = WeaponCategory.valueOf(name)
}