package com.app.chef.core.utils



import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.os.Build
import androidx.core.content.ContextCompat
import com.app.chef.R
import com.app.chef.core.helper.SharedPrefHelper


class ColorsRes(private val mContext: Context, original: Resources) : Resources(original.assets, original.displayMetrics, original.configuration) {

    fun getColorRes(id: Int): String {
        return SharedPrefHelper(mContext).getUtilsColor("colors_${getResourceEntryName(id) }") ?: run{
            val colorInt = ContextCompat.getColor(mContext, id)
            val colorHex = String.format("#%06X", 0xFFFFFF and colorInt)
            colorHex
        }
    }


    fun getColorXml(/*@ColorRes*/ colorName: String): Int {
        return try {
            val colorKey = "colors_$colorName"
            val colorValue = SharedPrefHelper(mContext).getUtilsColor(colorKey)
            colorValue?.let {
                Color.parseColor(it)
            } ?: run {
                // Fallback to colors.xml if colorValue is null
                val resId = mContext.resources.getIdentifier(colorName, "color", mContext.packageName)
                if (resId != 0) {
                    ContextCompat.getColor(mContext, resId)
                } else {
                    Color.TRANSPARENT
                }
            }

        } catch (e: NotFoundException) {
            Color.TRANSPARENT
        }
    }

    override fun getColor(id: Int): Int {
        return getColor(id, null)
    }

    override fun getColor(id: Int, theme: Theme?): Int {
        val colorName = "colors_${getResourceEntryName(id)}"
        val value = SharedPrefHelper(mContext).getUtilsColor(colorName)

        return when {
            value != null -> Color.parseColor(value)
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.M -> super.getColor(id, theme)
            else -> super.getColor(id)
        }
    }
}

