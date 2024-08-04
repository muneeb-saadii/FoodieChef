package com.example.globshop.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/globshop/db/ProductsDao;", "", "deleteProduct", "", "item", "Lcom/example/globshop/models/products/ProductsResponseItem;", "(Lcom/example/globshop/models/products/ProductsResponseItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllProducts", "Landroidx/lifecycle/LiveData;", "", "upsertProduct", "", "app_debug"})
public abstract interface ProductsDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object upsertProduct(@org.jetbrains.annotations.NotNull
    com.example.globshop.models.products.ProductsResponseItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull
    com.example.globshop.models.products.ProductsResponseItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM products")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.globshop.models.products.ProductsResponseItem>> getAllProducts();
}