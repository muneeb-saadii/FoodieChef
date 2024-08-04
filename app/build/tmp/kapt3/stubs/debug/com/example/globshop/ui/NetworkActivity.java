package com.example.globshop.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0006\u0010\u0013\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/globshop/ui/NetworkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "b", "Lcom/example/globshop/databinding/ActivityNetworkBinding;", "getB", "()Lcom/example/globshop/databinding/ActivityNetworkBinding;", "setB", "(Lcom/example/globshop/databinding/ActivityNetworkBinding;)V", "prodsAdapter", "Lcom/example/globshop/adapters/ProductsRecycAdapter;", "getProdsAdapter", "()Lcom/example/globshop/adapters/ProductsRecycAdapter;", "setProdsAdapter", "(Lcom/example/globshop/adapters/ProductsRecycAdapter;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "requestAllProducts", "setUpRecyc", "ApiHelper", "app_debug"})
public final class NetworkActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.example.globshop.databinding.ActivityNetworkBinding b;
    public com.example.globshop.adapters.ProductsRecycAdapter prodsAdapter;
    
    public NetworkActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.globshop.databinding.ActivityNetworkBinding getB() {
        return null;
    }
    
    public final void setB(@org.jetbrains.annotations.NotNull
    com.example.globshop.databinding.ActivityNetworkBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.globshop.adapters.ProductsRecycAdapter getProdsAdapter() {
        return null;
    }
    
    public final void setProdsAdapter(@org.jetbrains.annotations.NotNull
    com.example.globshop.adapters.ProductsRecycAdapter p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpRecyc() {
    }
    
    public final void requestAllProducts() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/globshop/ui/NetworkActivity$ApiHelper;", "", "()V", "getInstance", "Lretrofit2/Retrofit;", "app_debug"})
    public static final class ApiHelper {
        @org.jetbrains.annotations.NotNull
        public static final com.example.globshop.ui.NetworkActivity.ApiHelper INSTANCE = null;
        
        private ApiHelper() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final retrofit2.Retrofit getInstance() {
            return null;
        }
    }
}