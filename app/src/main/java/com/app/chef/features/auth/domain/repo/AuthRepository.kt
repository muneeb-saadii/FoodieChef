package com.app.chef.features.auth.domain.repo

import com.app.chef.db.AppDatabase
import com.app.chef.network.CallRequest

class AuthRepository(
    val db: AppDatabase
) {


    suspend fun getAllColors() =
        CallRequest.call.getAllProducts()
}