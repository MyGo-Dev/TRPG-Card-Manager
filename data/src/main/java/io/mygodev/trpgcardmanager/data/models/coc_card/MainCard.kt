package io.mygodev.trpgcardmanager.data.models.coc_card

import androidx.room.Embedded
import androidx.room.Entity
import io.mygodev.trpgcardmanager.data.models.BaseCard

/**
 * Main Card 是多种数据类的嵌合，不允许直接将所有字段写入进其中，尤其是技能字段（技能太多了……）
 */
@Entity
data class MainCard(
    @Embedded
    val baseCard: BaseCard
)
