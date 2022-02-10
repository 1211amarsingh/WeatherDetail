package com.kv.userweatherapp.presentation.welcome

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kv.userweatherapp.R

public class WelcomeFragmentDirections private constructor() {
  public companion object {
    public fun actionWelcomeFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_welcomeFragment_to_loginFragment)

    public fun actionWelcomeFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_welcomeFragment_to_mainFragment)
  }
}
