package com.macromate.ui.foodLog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FoodLogViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Food Log"
    }
    val text: LiveData<String> = _text
}