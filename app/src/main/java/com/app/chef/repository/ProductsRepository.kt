package com.app.chef.repository

import com.app.chef.db.AppDatabase
import com.app.chef.server.RequestInstance

class ProductsRepository(
    val db: AppDatabase
) {

    suspend fun getAllProducts() =
        RequestInstance.call.getAllProducts()
}