package com.kv.userweatherapp.presentation.welcome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/kv/userweatherapp/presentation/welcome/WelcomeViewModel;", "Landroidx/lifecycle/ViewModel;", "dataStoreManager", "Lcom/kv/userweatherapp/datalayer/pref/DataStoreManager;", "(Lcom/kv/userweatherapp/datalayer/pref/DataStoreManager;)V", "user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kv/userweatherapp/domain/model/UserModel;", "getUser", "()Landroidx/lifecycle/MutableLiveData;", "setUser", "(Landroidx/lifecycle/MutableLiveData;)V", "app_debug"})
public final class WelcomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.UserModel> user;
    
    public WelcomeViewModel(@org.jetbrains.annotations.NotNull()
    com.kv.userweatherapp.datalayer.pref.DataStoreManager dataStoreManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.UserModel> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.UserModel> p0) {
    }
}