package com.example.myapplication.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class Model : ViewModel() {

    private val _count = MutableLiveData(0)

    var count = _count


    fun onUp(){
        _count.value = (_count.value ?: 0) + 1
    }

}