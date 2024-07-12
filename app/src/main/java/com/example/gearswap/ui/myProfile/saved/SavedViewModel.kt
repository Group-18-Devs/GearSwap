package com.example.gearswap.ui.myProfile.saved

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SavedViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = " "
    }
    val text: LiveData<String> = _text
}