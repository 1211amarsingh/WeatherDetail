package com.kv.userweatherapp.datalayer.pref

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.kv.userweatherapp.domain.model.UserModel
import kotlinx.coroutines.flow.map

class DataStoreManager(val context: Context) {
    var USER_DATASTORE = "userprefs"
    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = USER_DATASTORE)

    companion object {
        val NAME = stringPreferencesKey("NAME")
    }

    suspend fun saveUser(phonebook: UserModel) {
        context.dataStore.edit {
            it[NAME] = phonebook.username
        }
    }

    suspend fun getUser() = context.dataStore.data.map {
        UserModel(
            username = it[NAME] ?: "",
        )
    }
    suspend fun getUser1() = context.dataStore.data.map {
        UserModel(
            username = it[NAME] ?: "",
        )
    }
}