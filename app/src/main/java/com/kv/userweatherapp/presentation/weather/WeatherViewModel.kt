package com.kv.userweatherapp.presentation.weather

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.kv.userweatherapp.domain.model.WeatherModel
import com.kv.userweatherapp.domain.repository.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WeatherViewModel(val weatherRepository: WeatherRepository) : ViewModel() {
    fun getWeatherData() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = weatherRepository.getWeather(
                "12.9082847623315",
                "77.65197822993314",
                "imperial",
                "b143bb707b2ee117e62649b358207d3e"
            )

            withContext(Dispatchers.Main) {
                val body = response.body()
                if (response.isSuccessful && response.code() == 200) {
                    weatherdata.value = body!!
                }
            }
        }
    }

    var weatherdata = MutableLiveData<WeatherModel>()

    init {

    }
}

class WeatherViewModelFactory(val weatherRepository: WeatherRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WeatherViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return WeatherViewModel(weatherRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}