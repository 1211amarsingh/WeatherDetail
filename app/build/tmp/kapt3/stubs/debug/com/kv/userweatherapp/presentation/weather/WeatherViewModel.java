package com.kv.userweatherapp.presentation.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/kv/userweatherapp/presentation/weather/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherRepository", "Lcom/kv/userweatherapp/domain/repository/WeatherRepository;", "(Lcom/kv/userweatherapp/domain/repository/WeatherRepository;)V", "getWeatherRepository", "()Lcom/kv/userweatherapp/domain/repository/WeatherRepository;", "weatherdata", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kv/userweatherapp/domain/model/WeatherModel;", "getWeatherdata", "()Landroidx/lifecycle/MutableLiveData;", "setWeatherdata", "(Landroidx/lifecycle/MutableLiveData;)V", "getWeatherData", "", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.kv.userweatherapp.domain.repository.WeatherRepository weatherRepository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.WeatherModel> weatherdata;
    
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.kv.userweatherapp.domain.repository.WeatherRepository weatherRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kv.userweatherapp.domain.repository.WeatherRepository getWeatherRepository() {
        return null;
    }
    
    public final void getWeatherData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.WeatherModel> getWeatherdata() {
        return null;
    }
    
    public final void setWeatherdata(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.WeatherModel> p0) {
    }
}