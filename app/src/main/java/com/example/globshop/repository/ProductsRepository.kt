package com.example.globshop.repository

import com.example.globshop.db.AppDatabase
import com.example.globshop.server.RequestInstance

class ProductsRepository(
    val db: AppDatabase
) {

    suspend fun getAllProducts() =
        RequestInstance.call.getAllProducts()
}