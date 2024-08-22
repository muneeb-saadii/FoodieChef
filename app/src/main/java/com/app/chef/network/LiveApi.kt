package com.app.chef.network

import com.app.chef.features.itemdetails.domain.model.product.ProductsResponse
import retrofit2.Response
import retrofit2.http.GET

interface LiveApi {

    @GET("products")
    suspend fun getAllProducts(
        /*@Query("API_KEY")
        apiKey: String = API_KEY*/
    ): Response<ProductsResponse>
}