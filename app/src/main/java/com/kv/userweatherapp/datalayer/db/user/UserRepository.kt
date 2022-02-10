package com.kv.userweatherapp.datalayer.db.user

import kotlinx.coroutines.flow.Flow

class UserRepository(val userDao: UserDao) {

    val userAll: Flow<List<UserEntity>> = userDao.getAllUsers()

    suspend fun update(user: UserEntity) {
        userDao.updateUser(user)
    }

    suspend fun insert(user: UserEntity) {
        userDao.insert(user)
    }
    suspend fun delete(user: UserEntity) {
        userDao.delete(user)
    }
}