package com.kv.userweatherapp.data.remote

import com.kv.userweatherapp.domain.model.WeatherModel
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("/data/2.5/onecall")
    suspend  fun getWeather(
        @Query("lat") lat: String?,
        @Query("lon") lon: String?,
        @Query("units") units: String?,
        @Query("appid") appid: String?
    ): Response<WeatherModel>
}