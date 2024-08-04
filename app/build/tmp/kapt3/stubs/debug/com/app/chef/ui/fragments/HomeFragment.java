package com.app.chef.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/app/chef/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/app/chef/databinding/FragmentHomeBinding;", "bind", "getBind", "()Lcom/app/chef/databinding/FragmentHomeBinding;", "mViewModel", "Lcom/app/chef/ui/viewmodels/ProductViewModel;", "getMViewModel", "()Lcom/app/chef/ui/viewmodels/ProductViewModel;", "setMViewModel", "(Lcom/app/chef/ui/viewmodels/ProductViewModel;)V", "prodsAdapter", "Lcom/app/chef/adapters/ProductsRecycAdapter;", "getProdsAdapter", "()Lcom/app/chef/adapters/ProductsRecycAdapter;", "setProdsAdapter", "(Lcom/app/chef/adapters/ProductsRecycAdapter;)V", "hideProgressBar", "", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupProdsRecycView", "showProgressBar", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.app.chef.databinding.FragmentHomeBinding _binding;
    public com.app.chef.ui.viewmodels.ProductViewModel mViewModel;
    public com.app.chef.adapters.ProductsRecycAdapter prodsAdapter;
    
    public HomeFragment() {
        super();
    }
    
    private final com.app.chef.databinding.FragmentHomeBinding getBind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.ui.viewmodels.ProductViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.NotNull
    com.app.chef.ui.viewmodels.ProductViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.adapters.ProductsRecycAdapter getProdsAdapter() {
        return null;
    }
    
    public final void setProdsAdapter(@org.jetbrains.annotations.NotNull
    com.app.chef.adapters.ProductsRecycAdapter p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showProgressBar() {
    }
    
    private final void setupProdsRecycView() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}