package com.kv.userweatherapp.presentation.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kv.userweatherapp.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_mainFragment)
  }
}
