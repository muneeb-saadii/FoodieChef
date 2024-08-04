package com.app.chef.models.products

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.app.chef.utils.Constants


@Entity(tableName = Constants.PRODUCTS_TABLE_NAME)
data class ProductsResponseItem(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val category: String,
    val description: String,
    val image: String,
    val price: Double,
    val rating: Rating,
    val title: String
)