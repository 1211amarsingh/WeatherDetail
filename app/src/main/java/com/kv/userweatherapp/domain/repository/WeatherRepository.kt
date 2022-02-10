package com.kv.userweatherapp.domain.repository

import com.kv.userweatherapp.data.remote.WeatherService
import com.kv.userweatherapp.domain.model.WeatherModel
import retrofit2.Response
import java.net.UnknownHostException


class WeatherRepository(val api: WeatherService) {
    suspend fun getWeather(
        lat: String,
        lon: String,
        units: String,
        appid: String
    ): Response<WeatherModel>? {
        try {
            val response = api.getWeather(
                lat, lon, units, appid
            )
            response.let {
                return it
            }
        } catch (e: UnknownHostException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null;
    }
}