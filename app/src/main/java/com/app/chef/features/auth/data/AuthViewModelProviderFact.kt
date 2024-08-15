package com.app.chef.features.auth.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.chef.features.auth.domain.repo.AuthRepository


class AuthViewModelProviderFact (
    val authRepository: AuthRepository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AuthViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AuthViewModel(authRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}