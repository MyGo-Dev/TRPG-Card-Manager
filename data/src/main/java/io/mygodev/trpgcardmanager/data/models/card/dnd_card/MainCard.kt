package io.mygodev.trpgcardmanager.data.models.card.dnd_card

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.Date


@Entity

data class MainCard(
    @ColumnInfo(name = "character_name")
    val characterName: String,

    @ColumnInfo(name = "player_name")
    val playerName: String,

    @ColumnInfo(name = "comments")
    val comment: String?

)

