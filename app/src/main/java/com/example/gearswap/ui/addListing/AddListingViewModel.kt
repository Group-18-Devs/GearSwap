package com.example.gearswap.ui.addListing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddListingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Add Listing Fragment"
    }
    val text: LiveData<String> = _text
}