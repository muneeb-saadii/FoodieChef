package com.app.chef.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.app.chef.models.products.ProductsResponseItem
import com.app.chef.core.utils.Constants
import com.app.chef.core.utils.Constants.Companion.ROOM_DB_NAME



@Database(
    entities = [ProductsResponseItem::class],
    version = Constants.ROOM_DB_VERSION
)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getProductsDao(): ProductsDao

    companion object{
        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            ROOM_DB_NAME
        ).build()
    }
}