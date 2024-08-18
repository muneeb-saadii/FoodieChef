package com.app.chef.core.helper

import android.content.Context
import com.app.chef.R

class SharedPrefHelper(val mContext: Context) {

    private val PREFS_NAME: String = "MyApp"


    fun saveColorUtils(map: HashMap<String, String>) {
        val sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        for ((key, value) in map) {
            editor.putString(key, value)
        }
        editor.apply()
    }

    fun getUtilsColor(key: String): String? {
        val sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getString(key, null)
    }

}