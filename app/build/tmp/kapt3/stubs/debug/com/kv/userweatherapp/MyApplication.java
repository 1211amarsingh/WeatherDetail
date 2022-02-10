package com.kv.userweatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/kv/userweatherapp/MyApplication;", "Landroid/app/Application;", "()V", "dataStoreManager", "Lcom/kv/userweatherapp/datalayer/pref/DataStoreManager;", "getDataStoreManager", "()Lcom/kv/userweatherapp/datalayer/pref/DataStoreManager;", "dataStoreManager$delegate", "Lkotlin/Lazy;", "database", "Lcom/kv/userweatherapp/datalayer/db/AppDatabase;", "getDatabase", "()Lcom/kv/userweatherapp/datalayer/db/AppDatabase;", "database$delegate", "userRepository", "Lcom/kv/userweatherapp/datalayer/db/user/UserRepository;", "getUserRepository", "()Lcom/kv/userweatherapp/datalayer/db/user/UserRepository;", "userRepository$delegate", "weatherRepository", "Lcom/kv/userweatherapp/domain/repository/WeatherRepository;", "getWeatherRepository", "()Lcom/kv/userweatherapp/domain/repository/WeatherRepository;", "weatherRepository$delegate", "app_debug"})
public final class MyApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dataStoreManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy userRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy weatherRepository$delegate = null;
    
    public MyApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kv.userweatherapp.datalayer.pref.DataStoreManager getDataStoreManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kv.userweatherapp.datalayer.db.AppDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kv.userweatherapp.datalayer.db.user.UserRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kv.userweatherapp.domain.repository.WeatherRepository getWeatherRepository() {
        return null;
    }
}