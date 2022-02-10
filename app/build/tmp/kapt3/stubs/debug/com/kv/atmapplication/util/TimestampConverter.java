package com.kv.atmapplication.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/kv/atmapplication/util/TimestampConverter;", "", "()V", "dateToTimestamp", "", "value", "Ljava/util/Date;", "fromTimestamp", "getOtherDate", "days", "", "dateFormat", "Ljava/text/DateFormat;", "getTodayDate", "getYesterdayDate", "app_debug"})
public final class TimestampConverter {
    
    public TimestampConverter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.Date fromTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String dateToTimestamp(@org.jetbrains.annotations.Nullable()
    java.util.Date value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTodayDate(@org.jetbrains.annotations.Nullable()
    java.text.DateFormat dateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYesterdayDate(@org.jetbrains.annotations.Nullable()
    java.text.DateFormat dateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOtherDate(int days, @org.jetbrains.annotations.Nullable()
    java.text.DateFormat dateFormat) {
        return null;
    }
}