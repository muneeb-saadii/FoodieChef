package com.app.chef.features.itemdetails.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/app/chef/features/itemdetails/data/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "prodsRepository", "Lcom/app/chef/features/itemdetails/domain/repo/ProductsRepository;", "(Lcom/app/chef/features/itemdetails/domain/repo/ProductsRepository;)V", "getProdsRepository", "()Lcom/app/chef/features/itemdetails/domain/repo/ProductsRepository;", "productsData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/chef/core/utils/Resource;", "Lcom/app/chef/features/itemdetails/domain/model/product/ProductsResponse;", "getProductsData", "()Landroidx/lifecycle/MutableLiveData;", "getAllProducts", "Lkotlinx/coroutines/Job;", "handleNetRequestResponse", "response", "Lretrofit2/Response;", "app_debug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.app.chef.features.itemdetails.domain.repo.ProductsRepository prodsRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<com.app.chef.features.itemdetails.domain.model.product.ProductsResponse>> productsData = null;
    
    public ProductViewModel(@org.jetbrains.annotations.NotNull
    com.app.chef.features.itemdetails.domain.repo.ProductsRepository prodsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.features.itemdetails.domain.repo.ProductsRepository getProdsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<com.app.chef.features.itemdetails.domain.model.product.ProductsResponse>> getProductsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getAllProducts() {
        return null;
    }
    
    private final com.app.chef.core.utils.Resource<com.app.chef.features.itemdetails.domain.model.product.ProductsResponse> handleNetRequestResponse(retrofit2.Response<com.app.chef.features.itemdetails.domain.model.product.ProductsResponse> response) {
        return null;
    }
}