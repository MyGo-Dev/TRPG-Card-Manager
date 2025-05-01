package io.mygodev.trpgcardmanager.data.models.dnd_card

import androidx.room.Embedded
import androidx.room.Entity
import io.mygodev.trpgcardmanager.data.models.BaseCard

/**
 * Main Card 是多种数据类的嵌合，不允许直接将所有字段写入进其中
 * DND的卡片请注意各熟练与豁免的标记
 */
@Entity
data class MainCard(
    @Embedded
    val baseCard: BaseCard
)
