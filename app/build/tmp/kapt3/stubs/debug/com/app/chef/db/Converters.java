package com.app.chef.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/app/chef/db/Converters;", "", "()V", "fromRating", "", "rate", "Lcom/app/chef/features/itemdetails/domain/model/product/Rating;", "toRating", "str", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String fromRating(@org.jetbrains.annotations.NotNull
    com.app.chef.features.itemdetails.domain.model.product.Rating rate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final com.app.chef.features.itemdetails.domain.model.product.Rating toRating(@org.jetbrains.annotations.NotNull
    java.lang.String str) {
        return null;
    }
}