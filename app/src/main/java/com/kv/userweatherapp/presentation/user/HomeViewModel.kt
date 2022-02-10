package com.kv.userweatherapp.presentation.user

import androidx.lifecycle.*
import com.kv.userweatherapp.datalayer.db.user.UserEntity
import com.kv.userweatherapp.datalayer.db.user.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(val userRepository: UserRepository) : ViewModel() {

    fun delete(userentity: UserEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            userRepository.delete(userentity)
        }
    }

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