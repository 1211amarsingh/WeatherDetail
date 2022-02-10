package com.kv.userweatherapp.presentation.login

import android.text.TextUtils
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kv.userweatherapp.domain.model.UserModel

class LoginViewModel : ViewModel() {

    val user_name = MutableLiveData("")
    val password = MutableLiveData("")
    val screenState = MutableLiveData<LoginState>()

    fun onLogin(view: View) {
        if (screenState.value is LoginState.Success) return
        screenState.value = LoginState.Loading
        val u_name = user_name.value.toString()
        val password_txt = password.value.toString()

        if (TextUtils.isEmpty(u_name)) {
            screenState.value = LoginState.Error("Please Enter User Name")

        } else if (TextUtils.isEmpty(password_txt)) {
            screenState.value = LoginState.Error("Please Enter Password")
        } else if (!u_name.equals("testapp@google.com", true)) {
            screenState.value = LoginState.Error("User not exist")
        } else if (!password_txt.equals("Test@123456")) {
            screenState.value = LoginState.Error("Invalid Password")
        } else {
            screenState.value = LoginState.Success("Login Successful!", UserModel(u_name))
        }
    }
}


class LoginViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return LoginViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
