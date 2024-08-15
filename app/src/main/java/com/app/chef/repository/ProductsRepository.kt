package com.app.chef.repository

import com.app.chef.db.AppDatabase
import com.app.chef.server.CallRequest

class ProductsRepository(
    val db: AppDatabase
) {

    suspend fun getAllProducts() =
        CallRequest.call.getAllProducts()
}