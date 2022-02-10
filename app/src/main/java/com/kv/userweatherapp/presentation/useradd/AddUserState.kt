package com.kv.userweatherapp.presentation.useradd
sealed class AddUserState {
    data class Success(val message: String) : AddUserState()
    data class Error(val message: String) : AddUserState()
    object Loading : AddUserState()
}
