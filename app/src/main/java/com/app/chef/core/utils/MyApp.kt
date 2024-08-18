package com.app.chef.core.utils

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MyApp(val mContext: Context) {



    fun showToast(msg:String){
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
    }
    fun showMessage(view: View, msg:String){
        Snackbar.make(mContext, view, msg, Snackbar.LENGTH_SHORT).show()
    }
}