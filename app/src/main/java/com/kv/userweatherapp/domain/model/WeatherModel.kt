package com.kv.userweatherapp.domain.model

data class WeatherModel(var current: CurrentModel)

data class CurrentModel(
    var temp: String,
    var humidity: String,
    var wind_speed: String,
    var weather: ArrayList<Weather>
)

data class Weather(var main: String)