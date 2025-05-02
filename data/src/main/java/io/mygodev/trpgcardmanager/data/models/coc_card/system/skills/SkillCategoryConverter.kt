package io.mygodev.trpgcardmanager.data.models.coc_card.system.skills

import androidx.room.TypeConverter

/** 类型转换器（Room数据库存储枚举） */
class SkillCategoryConverter {
    @TypeConverter
    fun fromCategory(category: SkillCategory): String = category.name

    @TypeConverter
    fun toCategory(name: String): SkillCategory = SkillCategory.valueOf(name)
}

