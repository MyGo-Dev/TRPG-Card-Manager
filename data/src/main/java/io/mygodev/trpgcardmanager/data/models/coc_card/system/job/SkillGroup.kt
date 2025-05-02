package io.mygodev.trpgcardmanager.data.models.coc_card.system.job

data class SkillGroup(
    val choose: Int,             // 需要选择的数量
    val from: List<Long>,      // 候选技能ID列表
)