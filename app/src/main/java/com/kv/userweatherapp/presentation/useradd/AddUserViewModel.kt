package com.kv.userweatherapp.presentation.useradd

import android.text.TextUtils
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.kv.userweatherapp.data.db.user.UserEntity
import com.kv.userweatherapp.data.db.user.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*

class AddUserViewModel(val userRepository: UserRepository) : ViewModel() {
    val fname = MutableLiveData("")
    val lname = MutableLiveData("")
    val email = MutableLiveData("")
    val screenState = MutableLiveData<AddUserState>()

    fun save(view: View) {
        if (screenState.value is AddUserState.Success) return
        screenState.value = AddUserState.Loading
        val f_name = fname.value.toString()
        val l_name = lname.value.toString()
        val email = email.value.toString()

        if (TextUtils.isEmpty(f_name)) {
            screenState.value = AddUserState.Error("Please Enter First Name")
        } else if (TextUtils.isEmpty(l_name)) {
            screenState.value = AddUserState.Error("Please Enter Last Name")
        } else if (TextUtils.isEmpty(email)) {
            screenState.value = AddUserState.Error("Please Enter Email")
        } else if (!email.contains("@")) {
            screenState.value = AddUserState.Error("Please Enter Valid Email")
        } else {
            viewModelScope.launch(Dispatchers.IO) {
                userRepository.insert(UserEntity(0, f_name, l_name, email, Date()))
                withContext(Dispatchers.Main) {
                    screenState.value = AddUserState.Success("Saved")
                }
            }
        }
    }
}

class AddUserViewModelFactory(val userRepository: UserRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddUserViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AddUserViewModel(userRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
