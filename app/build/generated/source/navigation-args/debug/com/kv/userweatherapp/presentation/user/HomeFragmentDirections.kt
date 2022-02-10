package com.kv.userweatherapp.presentation.user

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kv.userweatherapp.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionMainFragmentToUserAddFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_userAddFragment)

    public fun actionMainFragmentToWeatherFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_weatherFragment)
  }
}
