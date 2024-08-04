package com.example.globshop.db

import androidx.room.TypeConverter
import com.example.globshop.models.products.Rating

class Converters {

    @TypeConverter
    fun fromRating(rate: Rating): String = "${rate.rate}(${rate.count})"

    @TypeConverter
    fun toRating(str: String): Rating {
        val regex = """(\d+\.\d+)\((\d+)\)""".toRegex()
        val matchResult = regex.find(str)
        return if (matchResult != null) {
            val (rate, count) = matchResult.destructured
            Rating(count.toInt(), rate.toDouble())
        } else {
            Rating(0, 0.0)
        }
    }
}