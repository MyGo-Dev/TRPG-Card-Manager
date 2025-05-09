package io.mygodev.trpgcardmanager.data.models.card

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters


/**
 * 角色卡基础数据模型
 *
 * @property id: 主键
 * @property characterName: 角色名
 * @property playerName: 玩家名
 * @property cardType: 卡片类型
 * @property comment: 备注
 */
@Entity(
    tableName = "card_info"
)
@TypeConverters(
    CardTypeConverter::class
)
data class CardInfo(

    @PrimaryKey
    val id: Long,

    @ColumnInfo(name = "character_name")
    val characterName: String,

    @ColumnInfo(name = "player_name")
    val playerName: String,

    @ColumnInfo(name = "card_type")
    val cardType: CardType,

    @ColumnInfo(name = "comment")
    val comment: String?
)


enum class CardType{
    COC,
    DND,
}

class CardTypeConverter{
    @TypeConverter
    fun fromCardType(type: CardType): String = type.name

    @TypeConverter
    fun toCardType(type: String): CardType = CardType.valueOf(type)
}