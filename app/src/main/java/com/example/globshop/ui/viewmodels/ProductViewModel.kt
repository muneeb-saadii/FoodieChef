package com.example.globshop.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.globshop.models.products.ProductsResponse
import com.example.globshop.repository.ProductsRepository
import com.example.globshop.utils.Resource
import kotlinx.coroutines.Dispatchers
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

    private fun handleNetRequestResponse(response: Response<ProductsResponse>): Resource<ProductsResponse>{
        if(response.isSuccessful){
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Error(response.message())
    }
}