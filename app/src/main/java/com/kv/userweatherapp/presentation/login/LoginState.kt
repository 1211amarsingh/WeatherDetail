package com.kv.userweatherapp.presentation.login

import com.kv.userweatherapp.domain.model.UserModel

sealed class LoginState {
    data class Success(val message: String, val data: UserModel) : LoginState()
    data class Error(val message: String) : LoginState()
    object Loading : LoginState()
}