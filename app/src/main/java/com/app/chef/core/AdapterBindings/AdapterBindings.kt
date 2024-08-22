package com.app.chef.core.AdapterBindings

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter



@BindingAdapter("android:backgroundColor")
fun setBackgroundColor(view: View, color: Int) {
    view.setBackgroundColor(color)
}

/*
@BindingAdapter("android:backgroundColor")
fun setBackgroundColor(view: View, backgroundColor: String) {

    val color: Int = try {
        Color.parseColor(backgroundColor)
    } catch (e: Exception) {
        Color.parseColor("#$backgroundColor")
    }
    view.setBackgroundColor(color)
}*/
