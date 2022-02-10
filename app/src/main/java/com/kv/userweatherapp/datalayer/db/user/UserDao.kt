package com.kv.userweatherapp.datalayer.db.user

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun getAllUsers(): Flow<List<UserEntity>>

    @Update
    fun updateUser(userBalance: UserEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(userBalance: UserEntity)

//    @Query("DELETE FROM user_table")
//    suspend fun deleteAll()

}