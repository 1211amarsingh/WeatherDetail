package com.kv.userweatherapp.presentation.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import com.kv.userweatherapp.datalayer.db.user.UserEntity
import com.kv.userweatherapp.datalayer.db.user.UserRepository

class HomeViewModel(userRepository: UserRepository) : ViewModel() {

    var userAll: LiveData<List<UserEntity>> = userRepository.userAll.asLiveData()
}

class HomeViewModelFactory(val userRepository: UserRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return HomeViewModel(userRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}