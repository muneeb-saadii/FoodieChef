package com.example.globshop.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.globshop.repository.ProductsRepository
import com.example.globshop.ui.viewmodels.ProductViewModel

class ProductsVMProviderFactory(
    val prodsRepository: ProductsRepository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProductViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ProductViewModel(prodsRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}