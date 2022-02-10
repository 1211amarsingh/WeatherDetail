package com.kv.userweatherapp.presentation.welcome

import android.text.TextUtils
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.kv.userweatherapp.domain.model.UserModel
import com.kv.userweatherapp.data.pref.DataStoreManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WelcomeViewModel(dataStoreManager: DataStoreManager) : ViewModel() {
    var user = MutableLiveData<UserModel>()

    init {
        viewModelScope.launch {
            dataStoreManager.getUser().collect {
                Log.e("TTT", "h>" + Gson().toJson(it))

                if (!TextUtils.isEmpty(it.username)) {
                    withContext(Dispatchers.Main) {
                        user.value = it
                    }
                }
            }
        }
    }
}

class WelcomeViewModelFactory(val dataStoreManager: DataStoreManager) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WelcomeViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return WelcomeViewModel(dataStoreManager) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}