package com.app.chef.features.itemdetails.domain.repo

import com.app.chef.db.AppDatabase
import com.app.chef.network.CallRequest

class ProductsRepository(
    val db: AppDatabase
) {

    suspend fun getAllProducts() =
        CallRequest.call.getAllProducts()
}