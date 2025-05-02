package io.mygodev.trpgcardmanager.data.models.coc_card.system

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * COC 职业信息核心模型
 *
 * @property jobName    职业名称（如 "考古学家"）
 * @property minCredit 信用评级范围最小值
 * @property maxCredit 信用评级范围最大值
 * @property coreSkillRules 本职技能选择器
 * @property formulaExample 本职属性计算显示（仅用于UI显示）
 * @property formulaPattern 职业属性计算表达式规则：
 * 支持运算符：+ - * / ( )
 * 属性缩写：STR|CON|SIZ|DEX|APP|INT|POW|EDU
 * 示例："EDU*4" 或 "(APP + INT)*2"
 */
@Entity
data class JobInformation(
    @PrimaryKey
    val id: Long,
    val jobName: String,
    val minCredit: Int,
    val maxCredit: Int,
    val formulaPattern: String,
    /**
     * 专业技能选择规则（JSON结构）示例：
     * {
     *   "mandatory": ["技能ID1","技能ID2"], // 必选技能
     *   "optionalGroups": [
     *     {
     *       "choose": 2,                  // 需要选择的数量
     *       "from": ["技能ID3","技能ID4"],  // 候选技能池
     *     }
     *   ]
     * }
     */
    @ColumnInfo(name = "core_skills")
    val coreSkillRules: String,
    val formulaExample: String
)