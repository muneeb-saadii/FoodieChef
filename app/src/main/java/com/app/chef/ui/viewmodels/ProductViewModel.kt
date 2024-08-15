package com.app.chef.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.chef.models.products.ProductsResponse
import com.app.chef.repository.ProductsRepository
import com.app.chef.core.utils.Resource
import kotlinx.coroutines.launch
import retrofit2.Response


class ProductViewModel(
    val prodsRepository: ProductsRepository
): ViewModel() {

    /*init {
        getAllProducts()
    }*/


    val productsData: MutableLiveData<Resource<ProductsResponse>> = MutableLiveData()

    fun getAllProducts() = viewModelScope.launch {
        productsData.postValue(Resource.Loading())
        val response = prodsRepository.getAllProducts()
        productsData.postValue(handleNetRequestResponse(response))
    }

    private fun handleNetRequestResponse(response: Response<ProductsResponse>): Resource<ProductsResponse> {
        if(response.isSuccessful){
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Error(response.message())
    }
}