package com.app.chef.server

import com.app.chef.models.products.ProductsResponse
import retrofit2.Response
import retrofit2.http.GET

interface LiveApi {

    @GET("products")
    suspend fun getAllProducts(
        /*@Query("API_KEY")
        apiKey: String = API_KEY*/
    ): Response<ProductsResponse>
}