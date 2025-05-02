package io.mygodev.trpgcardmanager.data.models.coc_card.system

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

/**
 * COC 技能信息增强版实体
 *
 * @property calculationType 计算类型标记：
 * 0=固定值 | 1=属性计算 | 2=职业加成计算
 * @property relatedProperty 关联属性缩写（STR/INT等）
 * @property formula 计算公式表达式（当calculationType=1时生效）
 */
@Entity
@TypeConverters(SkillCategoryConverter::class)
data class SkillsInformation(
    @PrimaryKey
    val id: Long,

    /** 技能名称 */
    val name: String,

    /** 基础成功率（固定值或计算基准值） */
    val baseValue: Int,

    /** 技能专攻分类 */
    val category: SkillCategory?,

    /** 计算模式标识 */
    val calculationType: Int,

    /** 关联属性缩写（如 DEX, EDU 等） */
    val relatedProperty: String? = null,

    /** 动态计算公式（支持运算符和属性占位符） */
    val formula: String? = null
)



