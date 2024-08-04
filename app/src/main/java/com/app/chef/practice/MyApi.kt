package com.app.chef.practice

import com.app.chef.models.products.ProductsResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface MyApi {

    @GET("products")
    suspend fun getProducts(): Response<ProductsResponse>

    @GET("products")
    fun getAllProducts(): Call<ProductsResponse>
}