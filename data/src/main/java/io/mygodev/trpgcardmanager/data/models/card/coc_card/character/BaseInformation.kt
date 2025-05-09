package io.mygodev.trpgcardmanager.data.models.card.coc_card.character

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import io.mygodev.trpgcardmanager.data.models.card.CardInfo
import java.util.Date

/**
 * COC 角色基础信息
 *
 * @property age 角色年龄，允许未设定年龄的角色卡（null 值）
 * @property era 故事时代背景
 * @property gender 角色性别
 * @property hometown 角色故乡
 * @property location 角色当前地点
 * @property currentTime 角色当前时间
 */
@Entity(
    tableName = "coc_character_base_info",
    foreignKeys = [ForeignKey(
        entity = CardInfo::class,
        parentColumns = ["id"],
        childColumns = ["id"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class BaseInformation(
    @PrimaryKey
    val id: Long,

    @ColumnInfo(name = "character_age")
    val age: Int? = null,

    @ColumnInfo(name = "era")
    val era: String? = null,

    @ColumnInfo(name = "gender")
    val gender: String? = null,

    @ColumnInfo(name = "hometown")
    val hometown: String? = null,

    @ColumnInfo(name = "location")
    val location: String? = null,

    @ColumnInfo(name = "current_time")
    val currentTime: Date? = null
)
