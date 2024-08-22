package com.app.chef.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.app.chef.features.itemdetails.domain.model.product.ProductsResponseItem
import com.app.chef.core.utils.Constants.Companion.PRODUCTS_TABLE_NAME

@Dao
interface ProductsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertProduct(item: ProductsResponseItem): Long

    @Delete
    suspend fun deleteProduct(item: ProductsResponseItem)

    @Query("SELECT * FROM $PRODUCTS_TABLE_NAME")
    fun getAllProducts(): LiveData<List<ProductsResponseItem>>
}
