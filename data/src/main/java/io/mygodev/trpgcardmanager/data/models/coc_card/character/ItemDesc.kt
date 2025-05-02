package io.mygodev.trpgcardmanager.data.models.coc_card.character

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "coc_character_item_desc",
    foreignKeys = [
        ForeignKey(
            entity = BaseInformation::class,
            parentColumns = ["id"],
            childColumns = ["characterId"],
            onDelete = ForeignKey.CASCADE
        )
    ]

)
data class ItemDesc(
    @PrimaryKey
    @ColumnInfo(name = "character_id", index = true)
    val characterId: Long,

    )
