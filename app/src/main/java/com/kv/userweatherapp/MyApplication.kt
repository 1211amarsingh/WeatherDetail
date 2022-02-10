package com.kv.userweatherapp

import android.app.Application
import com.kv.userweatherapp.datalayer.db.AppDatabase
import com.kv.userweatherapp.datalayer.db.user.UserRepository
import com.kv.userweatherapp.datalayer.pref.DataStoreManager
import com.kv.userweatherapp.di.ApiClient
import com.kv.userweatherapp.domain.repository.WeatherRepository

class MyApplication : Application() {
    val dataStoreManager: DataStoreManager by lazy {
        DataStoreManager(applicationContext)
    }
    val database by lazy { AppDatabase.getInstance(this) }
    val userRepository by lazy { UserRepository(database.userDao()) }
    val weatherRepository by lazy { WeatherRepository(ApiClient.apiService) }
}