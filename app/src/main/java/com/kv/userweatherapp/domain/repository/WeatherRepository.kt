package com.kv.userweatherapp.domain.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.kv.userweatherapp.data.remote.WeatherService
import com.kv.userweatherapp.domain.model.WeatherModel
import retrofit2.Response


class WeatherRepository(val api: WeatherService) {
    suspend fun getWeather(
        lat: String,
        lon: String,
        units: String,
        appid: String
    ): Response<WeatherModel> {
      return  api.getWeather(
            lat, lon, units, appid
        )

    }
}