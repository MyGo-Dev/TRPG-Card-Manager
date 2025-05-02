package io.mygodev.trpgcardmanager.data.models.coc_card.system.weapon

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import io.mygodev.trpgcardmanager.data.models.coc_card.system.skills.SkillsInformation

/**
 * COC武器描述
 *
 * @property id 武器唯一标识符
 * @property weaponType 具体武器型号描述，如".22小型自动手枪"
 * @property relatedSkillId 关联技能ID，对应[SkillsInformation]中的技能
 * @property damageExpression 伤害计算表达式，支持标准骰子语法（如"1d6+1/2DB"）
 * @property effectiveRange 有效射程描述，支持复合格式（如"接触/30码"）
 * @property isArmorPiercing 是否具有护甲穿透特性
 * @property attacksPerRound 每回合最大攻击次数
 * @property magazineCapacity 弹匣容量（null表示无限或无需装填）
 * @property malfunctionValue 武器故障概率值（0-99）
 * @property commonEras 适用时代集合，使用[CommonEra]枚举
 * @property price1920s 1920年代基础价格（美元，null表示该时代不可用）
 * @property priceModern 现代基础价格（美元，null表示现代不可用）
 * @property inventionYear 首次出现年份描述（支持非数字格式）
 * @property category 武器分类，使用[WeaponCategory]枚举
 *
 * @see SkillsInformation 关联技能实体
 * @see CommonEraConverter 时代集合类型转换器
 * @see WeaponCategoryConverter 武器分类类型转换器
 */
@Entity(
    tableName = "weapons",
    foreignKeys = [
        ForeignKey(
            entity = SkillsInformation::class,
            parentColumns = ["id"],
            childColumns = ["related_skill_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Weapon(
    @PrimaryKey
    val id: Long = 0,

    @ColumnInfo(name = "weapon_type")
    val weaponType: String,

    @ColumnInfo(name = "related_skill_id")
    val relatedSkillId: Long,

    @ColumnInfo(name = "damage_expression")
    val damageExpression: String,

    @ColumnInfo(name = "effective_range")
    val effectiveRange: String,

    @ColumnInfo(name = "is_armor_piercing")
    val isArmorPiercing: Boolean,

    @ColumnInfo(name = "attacks_per_round")
    val attacksPerRound: Int,

    @ColumnInfo(name = "magazine_capacity")
    val magazineCapacity: Int?,

    @ColumnInfo(name = "malfunction_value")
    val malfunctionValue: Int,

    @TypeConverters(CommonEraConverter::class)
    @ColumnInfo(name = "common_eras")
    val commonEras: Set<CommonEra>,

    @ColumnInfo(name = "price_1920s")
    val price1920s: Int?,

    @ColumnInfo(name = "price_modern")
    val priceModern: Int?,

    @ColumnInfo(name = "invention_year")
    val inventionYear: String,

    @TypeConverters(WeaponCategoryConverter::class)
    @ColumnInfo(name = "category")
    val category: WeaponCategory
)
