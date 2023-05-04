package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PhoneDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "color_id") val colorID: Long,
    @ColumnInfo(name = "tag_id") val tagID: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_PHONES = listOf(
            PhoneDbModel(1,"Anny Davidson" , "098123456" , 5 ,2,false),
            PhoneDbModel(2,"Billy Smith" , "094741852" , 3 ,2,false),
            PhoneDbModel(3,"Emily Stone" , "095357159" , 4 ,2,false),
            PhoneDbModel(4,"Kevin Deplay" , "096841962" , 2 ,2,false),
        )
    }
}
