package com.swon.viewmodel_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    private val _num: MutableLiveData<Int> = MutableLiveData(0)
    val num: LiveData<Int>
        get() = _num

    fun plus(){
        _num.value = _num.value?.plus(1)
    }
    fun minus(){
        _num.value = _num.value?.minus(1)
    }
}