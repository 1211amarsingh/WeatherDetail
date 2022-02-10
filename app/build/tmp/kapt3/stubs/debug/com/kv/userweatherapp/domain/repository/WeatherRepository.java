package com.kv.userweatherapp.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/kv/userweatherapp/domain/repository/WeatherRepository;", "", "api", "Lcom/kv/userweatherapp/data/remote/WeatherService;", "(Lcom/kv/userweatherapp/data/remote/WeatherService;)V", "getApi", "()Lcom/kv/userweatherapp/data/remote/WeatherService;", "getWeather", "Lretrofit2/Response;", "Lcom/kv/userweatherapp/domain/model/WeatherModel;", "lat", "", "lon", "units", "appid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.kv.userweatherapp.data.remote.WeatherService api = null;
    
    public WeatherRepository(@org.jetbrains.annotations.NotNull()
    com.kv.userweatherapp.data.remote.WeatherService api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kv.userweatherapp.data.remote.WeatherService getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String lon, @org.jetbrains.annotations.NotNull()
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    java.lang.String appid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kv.userweatherapp.domain.model.WeatherModel>> continuation) {
        return null;
    }
}