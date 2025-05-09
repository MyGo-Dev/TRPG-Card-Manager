package io.mygodev.trpgcardmanager.data.models.card.coc_card.character

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

/**
 * COC角色背景故事核心数据实体
 *
 * 存储角色背景故事的九个标准组成部分，每个部分包含：
 * - 描述内容（允许空值）
 * - 关键背景标记（除整体背景故事外，其余部分均具备）
 *
 * @property characterId 关联角色ID（与BaseInformation.id外键关联）
 */
@Entity(
    tableName = "coc_character_story",
    foreignKeys = [
        ForeignKey(
            entity = BaseInformation::class,
            parentColumns = ["id"],
            childColumns = ["characterId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class StoryInformation(
    @PrimaryKey
    @ColumnInfo(name = "character_id", index = true)
    val characterId: Long,

    /** 角色形象描述文本内容 */
    @ColumnInfo(name = "appearance_desc")
    val appearanceDesc: String? = null,

    /** 标识形象描述是否为关键背景 */
    @ColumnInfo(name = "is_appearance_key")
    val isAppearanceKey: Boolean? = null,

    /** 思想与信念描述文本 */
    @ColumnInfo(name = "belief_desc")
    val beliefDesc: String? = null,

    /** 标识思想信念是否为关键背景 */
    @ColumnInfo(name = "is_belief_key")
    val isBeliefKey: Boolean? = null,

    /** 重要之人描述文本 */
    @ColumnInfo(name = "important_person_desc")
    val importantPersonDesc: String? = null,

    /** 标识重要之人是否为关键背景 */
    @ColumnInfo(name = "is_person_key")
    val isPersonKey: Boolean? = null,

    /** 意义非凡之地描述文本 */
    @ColumnInfo(name = "significant_place_desc")
    val significantPlaceDesc: String? = null,

    /** 标识地点描述是否为关键背景 */
    @ColumnInfo(name = "is_place_key")
    val isPlaceKey: Boolean? = null,

    /** 宝贵之物描述文本 */
    @ColumnInfo(name = "valuable_item_desc")
    val valuableItemDesc: String? = null,

    /** 标识物品描述是否为关键背景 */
    @ColumnInfo(name = "is_item_key")
    val isItemKey: Boolean? = null,

    /** 角色特质描述文本 */
    @ColumnInfo(name = "trait_desc")
    val traitDesc: String? = null,

    /** 标识特质描述是否为关键背景 */
    @ColumnInfo(name = "is_trait_key")
    val isTraitKey: Boolean? = null,

    /** 伤口与疤痕描述文本 */
    @ColumnInfo(name = "scar_desc")
    val scarDesc: String? = null,

    /** 标识伤疤描述是否为关键背景 */
    @ColumnInfo(name = "is_scar_key")
    val isScarKey: Boolean? = null,

    /** 恐惧症与躁狂症描述文本 */
    @ColumnInfo(name = "phobia_desc")
    val phobiaDesc: String? = null,

    /** 标识心理症状是否为关键背景 */
    @ColumnInfo(name = "is_phobia_key")
    val isPhobiaKey: Boolean? = null,

    /** 完整背景故事叙述文本（无关键标记） */
    @ColumnInfo(name = "background_story")
    val backgroundStory: String? = null
)