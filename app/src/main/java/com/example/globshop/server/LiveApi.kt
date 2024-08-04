package com.example.globshop.server

import com.example.globshop.models.products.ProductsResponse
import com.example.globshop.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LiveApi {

    @GET("products")
    suspend fun getAllProducts(
        /*@Query("API_KEY")
        apiKey: String = API_KEY*/
    ): Response<ProductsResponse>
}