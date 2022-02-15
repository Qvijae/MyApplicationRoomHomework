package com.example.myapplicationroomhomework.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "key_value_pairs")
data class KeyValuePair(
    @PrimaryKey
    @NotNull
    var id: Int,
    var key: String = "",
    var value: String = ""
)