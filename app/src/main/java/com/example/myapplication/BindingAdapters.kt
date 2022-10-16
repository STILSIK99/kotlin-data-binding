package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:hideIfZero")
    fun hideIfZero(view : View, number: Int){
        view.visibility = if (number == 0) View.GONE else View.VISIBLE
    }

//@BindingAdapter(value = ["app:hideIfZero"], requireAll = true)
@BindingAdapter("app:showParity")
    fun setParity(textParity: TextView, count : Int){
        textParity.text = when {
            count % 2 == 0 -> "Чётное"
            else -> "Нечётное"
        }
    }