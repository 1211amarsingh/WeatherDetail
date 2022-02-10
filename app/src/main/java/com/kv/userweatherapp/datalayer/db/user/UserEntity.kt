package com.kv.userweatherapp.datalayer.db.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Int,
    @ColumnInfo(name = "first_name") var first_name: String,
    @ColumnInfo(name = "last_name") var last_name: String,
    @ColumnInfo(name = "email") var email: String,
    @ColumnInfo(name = "date") var date: Date
)