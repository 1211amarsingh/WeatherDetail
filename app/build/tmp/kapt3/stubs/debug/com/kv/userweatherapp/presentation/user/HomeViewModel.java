package com.kv.userweatherapp.presentation.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/kv/userweatherapp/presentation/user/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/kv/userweatherapp/datalayer/db/user/UserRepository;", "(Lcom/kv/userweatherapp/datalayer/db/user/UserRepository;)V", "userAll", "Landroidx/lifecycle/LiveData;", "", "Lcom/kv/userweatherapp/datalayer/db/user/UserEntity;", "getUserAll", "()Landroidx/lifecycle/LiveData;", "setUserAll", "(Landroidx/lifecycle/LiveData;)V", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.kv.userweatherapp.datalayer.db.user.UserEntity>> userAll;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.kv.userweatherapp.datalayer.db.user.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.kv.userweatherapp.datalayer.db.user.UserEntity>> getUserAll() {
        return null;
    }
    
    public final void setUserAll(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.kv.userweatherapp.datalayer.db.user.UserEntity>> p0) {
    }
}