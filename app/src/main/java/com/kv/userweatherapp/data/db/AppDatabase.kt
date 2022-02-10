package com.kv.userweatherapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kv.atmapplication.util.TimestampConverter
import com.kv.userweatherapp.data.db.user.UserEntity
import com.kv.userweatherapp.data.db.user.UserDao

@Database(
    entities = arrayOf(UserEntity::class),
    version = 1,
    exportSchema = false
)
@TypeConverters(TimestampConverter::class)

abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "weather_room_db"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}