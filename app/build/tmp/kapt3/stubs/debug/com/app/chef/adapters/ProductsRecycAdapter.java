package com.app.chef.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u001c\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J \u0010\u0018\u001a\u00020\u000f2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rR\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/app/chef/adapters/ProductsRecycAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/app/chef/adapters/ProductsRecycAdapter$MyViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/app/chef/models/products/ProductsResponseItem;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "onItemClickListener", "Lkotlin/Function2;", "", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "MyViewHolder", "app_debug"})
public final class ProductsRecycAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.app.chef.adapters.ProductsRecycAdapter.MyViewHolder> {
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.app.chef.models.products.ProductsResponseItem> differCallback = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.app.chef.models.products.ProductsResponseItem> differ = null;
    private kotlin.jvm.functions.Function2<? super com.app.chef.models.products.ProductsResponseItem, ? super java.lang.Integer, kotlin.Unit> onItemClickListener;
    
    public ProductsRecycAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<com.app.chef.models.products.ProductsResponseItem> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.app.chef.adapters.ProductsRecycAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.app.chef.adapters.ProductsRecycAdapter.MyViewHolder holder, int position) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.app.chef.models.products.ProductsResponseItem, ? super java.lang.Integer, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/app/chef/adapters/ProductsRecycAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/app/chef/databinding/ProductItemDesignBinding;", "(Lcom/app/chef/adapters/ProductsRecycAdapter;Lcom/app/chef/databinding/ProductItemDesignBinding;)V", "getBinding", "()Lcom/app/chef/databinding/ProductItemDesignBinding;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.app.chef.databinding.ProductItemDesignBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.app.chef.databinding.ProductItemDesignBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.app.chef.databinding.ProductItemDesignBinding getBinding() {
            return null;
        }
    }
}