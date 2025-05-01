package io.mygodev.trpgcardmanager.data.models

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.util.Date


/**
 * 角色卡基础数据模型，所有具体角色卡类型理论上应继承此类
 *
 * 由于 Room 框架限制，实际实现时：
 * 1. 禁止直接继承本类
 * 2. 应通过 `@Embedded` 嵌入此基类字段
 * 3. 子类需在自己的 `@Entity` 类中显式声明全部字段
 */
data class BaseCard(

    @PrimaryKey(autoGenerate = true)
    val id: Long,

    @ColumnInfo(name = "character_name")
    val characterName: String,

    @ColumnInfo(name = "player_name")
    val playerName: String,

    @ColumnInfo(name = "create_at")
    val createAt: Date?,

    @ColumnInfo(name = "update_at")
    val updateAt: Date?
)
