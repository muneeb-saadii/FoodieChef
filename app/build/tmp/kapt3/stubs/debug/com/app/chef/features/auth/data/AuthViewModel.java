package com.app.chef.features.auth.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'J\u0016\u0010(\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nJ\u000e\u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/app/chef/features/auth/data/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/app/chef/features/auth/domain/repo/AuthRepository;", "(Lcom/app/chef/features/auth/domain/repo/AuthRepository;)V", "getAuthRepository", "()Lcom/app/chef/features/auth/domain/repo/AuthRepository;", "googleLoginResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/chef/core/utils/Resource;", "", "getGoogleLoginResult", "()Landroidx/lifecycle/MutableLiveData;", "loginResult", "getLoginResult", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "reference", "Lcom/google/firebase/database/DatabaseReference;", "resetPassResult", "getResetPassResult", "rootNode", "Lcom/google/firebase/database/FirebaseDatabase;", "signupResult", "getSignupResult", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "handleNetRequestResponse", "response", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/AuthResult;", "loginUser", "", "email", "password", "loginWithGoogle", "credential", "Lcom/google/firebase/auth/AuthCredential;", "registerUser", "resetLinkToMail", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.app.chef.features.auth.domain.repo.AuthRepository authRepository = null;
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private com.google.firebase.storage.FirebaseStorage storage;
    private com.google.firebase.storage.StorageReference storageReference;
    private com.google.firebase.database.FirebaseDatabase rootNode;
    private com.google.firebase.database.DatabaseReference reference;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<java.lang.String>> signupResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<java.lang.String>> loginResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<java.lang.String>> resetPassResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<java.lang.String>> googleLoginResult = null;
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.app.chef.features.auth.domain.repo.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.features.auth.domain.repo.AuthRepository getAuthRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<java.lang.String>> getSignupResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<java.lang.String>> getLoginResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<java.lang.String>> getResetPassResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.app.chef.core.utils.Resource<java.lang.String>> getGoogleLoginResult() {
        return null;
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void loginUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void loginWithGoogle(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.AuthCredential credential) {
    }
    
    private final com.app.chef.core.utils.Resource<java.lang.String> handleNetRequestResponse(com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> response) {
        return null;
    }
    
    public final void resetLinkToMail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
}