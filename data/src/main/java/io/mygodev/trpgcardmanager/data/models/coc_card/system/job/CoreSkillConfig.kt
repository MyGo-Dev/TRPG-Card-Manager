package io.mygodev.trpgcardmanager.data.models.coc_card.system.job

/**
 * 本职技能选择配置
 * @property mandatory 必选技能
 * @property optionalGroups 可选技能
 */
data class CoreSkillConfig(
    val mandatory: List<Long>,
    val optionalGroups: List<SkillGroup>
)