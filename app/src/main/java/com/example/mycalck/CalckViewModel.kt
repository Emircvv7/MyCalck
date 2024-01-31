package com.example.mycalck

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalckViewModel : ViewModel() {
    val counter = MutableLiveData<Int>().apply { value = 0 }

    fun incrementCounter() {
        counter.value = counter.value?.plus(1)
    }

    fun decrementCounter() {
        counter.value = counter.value?.minus(1)
    }
}