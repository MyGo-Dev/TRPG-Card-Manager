package io.mygodev.trpgcardmanager.data.models.card.coc_card.character

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

/**
 * COC 角色核心属性存储实体
 *
 * @property characterId 外键关联到角色基本信息表
 * @property strCurrent 当前力量( STR )值
 * @property conInitial 初始体质值
 * @property sizCurrent 当前体型值
 * @property dexInitial 初始敏捷值
 * @property appCurrent 当前外貌值
 * @property intInitial 初始智力值
 * @property powCurrent 当前意志值
 * @property eduInitial 初始教育值
 * @property luckCurrent 当前幸运值
 * @property luckInitial 初始幸运值
 * @property hpCurrent 当前生命值（HP）
 * @property sanCurrent 当前理智值（SAN）
 * @property mpCurrent 当前魔法值（MP）
 * @property mpRegenRate 魔法值每小时恢复量（MP/HR）
 * @property movBase 基础移动力（MOV）
 * @property armorValue 护甲值
 */
@Entity(
    tableName = "coc_character_attributes",
    foreignKeys = [ForeignKey(
        entity = BaseInformation::class,
        parentColumns = ["id"],
        childColumns = ["characterId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class CocAttributes(
    @PrimaryKey
    @ColumnInfo(name = "character_id", index = true)
    val characterId: Long,

    @ColumnInfo(name = "strength_current")
    val strCurrent: Int,

    @ColumnInfo(name = "constitution_initial")
    val conInitial: Int,

    @ColumnInfo(name = "size_current")
    val sizCurrent: Int,

    @ColumnInfo(name = "dexterity_initial")
    val dexInitial: Int,

    @ColumnInfo(name = "appearance_current")
    val appCurrent: Int,

    @ColumnInfo(name = "intelligence_initial")
    val intInitial: Int,

    @ColumnInfo(name = "power_current")
    val powCurrent: Int,

    @ColumnInfo(name = "education_initial")
    val eduInitial: Int,

    @ColumnInfo(name = "luck_current")
    val luckCurrent: Int,

    @ColumnInfo(name = "luck_initial")
    val luckInitial: Int,

    @ColumnInfo(name = "hp_current")
    val hpCurrent: Int,

    @ColumnInfo(name = "san_current")
    val sanCurrent: Int,

    @ColumnInfo(name = "mp_current")
    val mpCurrent: Int,

    @ColumnInfo(name = "mp_regen_rate")
    val mpRegenRate: Int,

    @ColumnInfo(name = "mov_base")
    val movBase: Int,

    @ColumnInfo(name = "armor_value")
    val armorValue: Int
)
