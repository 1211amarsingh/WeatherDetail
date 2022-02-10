package com.kv.userweatherapp.datalayer.db.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/kv/userweatherapp/datalayer/db/user/UserRepository;", "", "userDao", "Lcom/kv/userweatherapp/datalayer/db/user/UserDao;", "(Lcom/kv/userweatherapp/datalayer/db/user/UserDao;)V", "userAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kv/userweatherapp/datalayer/db/user/UserEntity;", "getUserAll", "()Lkotlinx/coroutines/flow/Flow;", "getUserDao", "()Lcom/kv/userweatherapp/datalayer/db/user/UserDao;", "insert", "", "user", "(Lcom/kv/userweatherapp/datalayer/db/user/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.kv.userweatherapp.datalayer.db.user.UserDao userDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.kv.userweatherapp.datalayer.db.user.UserEntity>> userAll = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.kv.userweatherapp.datalayer.db.user.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kv.userweatherapp.datalayer.db.user.UserDao getUserDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.kv.userweatherapp.datalayer.db.user.UserEntity>> getUserAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.kv.userweatherapp.datalayer.db.user.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.kv.userweatherapp.datalayer.db.user.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}