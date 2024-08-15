package com.app.chef.features.auth.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.chef.core.utils.Resource
import com.app.chef.features.auth.domain.repo.AuthRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class AuthViewModel (
    val authRepository: AuthRepository
): ViewModel() {

    init {

    }


    /*val authData: MutableLiveData<Resource<ProductsResponse>> = MutableLiveData()

    fun getAllProducts() = viewModelScope.launch {
        productsData.postValue(Resource.Loading())
        val response = authRepository.getAllColors()
        productsData.postValue(handleNetRequestResponse(response))
    }

    private fun handleNetRequestResponse(response: Response<ProductsResponse>): Resource<ProductsResponse>{
        if(response.isSuccessful){
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Error(response.message())
    }*/
}